using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Antlr4.Runtime;

namespace ANTLR_poj2
{
    class Program
    {
        static void Main(string[] args)
        {
            var inputStream = new AntlrFileStream("C:\\Users\\stanc\\OneDrive\\Documente\\ANTLR-poj2\\ANTLR-poj2\\program_LFC.txt");
            //var inputStream = new AntlrFileStream("C:\\Users\\elena\\OneDrive\\Documente\\Facultate-INFORMATICA\\An_2\\sem1\\LFC\\ANTLR-poj3\\ANTLR-poj2\\ANTLR-poj2\\program_LFC.txt");

            var lexer = new MiniCPPLexer(inputStream);

            var tokenStream = new CommonTokenStream(lexer);

            var parser = new MiniCPPParser(tokenStream);

            var errorMessages = new List<string>();

            parser.RemoveErrorListeners();

            parser.AddErrorListener(new CustomErrorListener(errorMessages));

            var programContext = parser.program();

            ProcessLexicalUnits(tokenStream);

            ExtractLocalVariables(programContext, errorMessages);

            ExtractGlobalVariables(programContext, errorMessages);

            ExtractFunctions(programContext);

            ExtractStructures(programContext);

            CheckForErrors(errorMessages);

            Console.WriteLine("Apasati o tasta pentru a inchide...");

            Console.ReadKey();
        }

        static void ProcessLexicalUnits(CommonTokenStream tokenStream)
        {
            using (var writer = new StreamWriter("lexical_units.txt"))
            {
                writer.WriteLine("Lista unitatilor lexicale:");

                foreach (var token in tokenStream.GetTokens())
                {
                    string tokenName = GetTokenName(token.Type);

                    writer.WriteLine($"Token: {tokenName}, Lexema: {token.Text}, Linie: {token.Line}");
                }
            }
        }

        static string GetTokenName(int tokenType)
        {
            switch (tokenType)
            {
                case MiniCPPLexer.IF: return "IF";
                case MiniCPPLexer.ELSE: return "ELSE";
                case MiniCPPLexer.FOR: return "FOR";
                case MiniCPPLexer.WHILE: return "WHILE";
                case MiniCPPLexer.INT: return "INT";
                case MiniCPPLexer.FLOAT: return "FLOAT";
                case MiniCPPLexer.STR: return "STRING";
                case MiniCPPLexer.VOID: return "VOID";
                case MiniCPPLexer.ID: return "IDENTIFIER";
                case MiniCPPLexer.NUMBER: return "NUMBER";
                case MiniCPPLexer.STRING_LITERAL: return "STRING_LITERAL";
                case MiniCPPLexer.INCLUDE: return "INCLUDE";
                case MiniCPPLexer.ASSIGN: return "ASSIGN";
                case MiniCPPLexer.PLUS: return "PLUS";
                case MiniCPPLexer.MINUS: return "MINUS";
                case MiniCPPLexer.STAR: return "MULTIPLY";
                case MiniCPPLexer.DIV: return "DIVIDE";
                case MiniCPPLexer.MOD: return "MODULE";
                case MiniCPPLexer.SEMICOLON: return "SEMICOLON";
                case MiniCPPLexer.DOT: return "DOT";
                case MiniCPPLexer.GREATER: return "GREATER";
                case MiniCPPLexer.LESS: return "LESS";
                case MiniCPPLexer.EQUAL: return "EQUAL";
                case MiniCPPLexer.NOT_EQUAL: return "NOT_EQUAL";
                case MiniCPPLexer.AND: return "AND";
                case MiniCPPLexer.OR: return "OR";
                case MiniCPPLexer.NOT: return "NOT";
                case MiniCPPLexer.LPAREN: return "LEFT_PARENTHESIS";
                case MiniCPPLexer.RPAREN: return "RIGHT_PARENTHESIS";
                case MiniCPPLexer.LBRACE: return "LEFT_BRACE";
                case MiniCPPLexer.RBRACE: return "RIGHT_BRACE";
                case MiniCPPLexer.COMMA: return "COMMA";
                case MiniCPPLexer.WS: return "WHITESPACE";
                case Antlr4.Runtime.TokenConstants.EOF: return "EOF";
                default: return "Unknown";
            }
        }

        static void ExtractLocalVariables(MiniCPPParser.ProgramContext programContext, List<string> errorMessages)
        {
            Dictionary<string, string> localVariables = new Dictionary<string, string>();

            using (var writer = new StreamWriter("lexical_units.txt", append: true))
            {
                writer.WriteLine("\nLista variabilelor locale:");

                foreach (var statement in programContext.statement())
                {
                    if (statement.varDecl() != null)
                    {
                        var varDecl = statement.varDecl();

                        string name = varDecl.ID().GetText();

                        string type = varDecl.children[0].GetText();

                        string value = varDecl.expr()?.GetText();

                        if (localVariables.ContainsKey(name))
                        {
                            string errorMessage = $"Eroare: Variabila locală \"{name}\" a fost deja declarată în funcție.";

                            errorMessages.Add(errorMessage);

                            writer.WriteLine(errorMessage);
                        }
                        else
                        {
                            localVariables.Add(name, type);

                            if (value != null && !IsCompatibleType(type, value))
                            {
                                string errorMessage = $"Eroare: Tip incompatibil pentru atribuirea valorii \"{value}\" la variabila locală \"{name}\" de tip {type}.";

                                errorMessages.Add(errorMessage);

                                writer.WriteLine(errorMessage);
                            }

                            writer.WriteLine($"Variabila locală: {name}, Tip: {type}, Valoare: {value ?? "null"}");
                        }
                    }
                    else if (statement.assignment() != null)
                    {
                        var assignment = statement.assignment();

                        string name = assignment.ID().GetText();

                        string value = assignment.expr().GetText();

                        string type = GetVariableType(name, localVariables);

                        if (!IsCompatibleType(type, value))
                        {
                            string errorMessage = $"Eroare: Tip incompatibil pentru atribuirea valorii \"{value}\" la variabila locală \"{name}\" de tip {type}.";

                            errorMessages.Add(errorMessage);

                            writer.WriteLine(errorMessage);
                        }
                        else
                        {
                            writer.WriteLine($"Atribuire validă: {name} = {value}");
                        }
                    }
                }
            }
        }

        static string GetVariableType(string varName, Dictionary<string, string> localVariables)
        {
            if (localVariables.ContainsKey(varName))
            {
                return localVariables[varName];
            }
            else
            {
                throw new Exception($"Eroare: Variabila \"{varName}\" nu a fost declarată.");
            }
        }

        static void ExtractGlobalVariables(MiniCPPParser.ProgramContext programContext, List<string> errorMessages)
        {
            HashSet<string> globalVarNames = new HashSet<string>();

            using (var writer = new StreamWriter("lexical_units.txt", append: true))
            {
                writer.WriteLine("\nLista variabilelor globale:");

                foreach (var statement in programContext.statement())
                {
                    if (statement.varDecl() != null)
                    {
                        var varDecl = statement.varDecl();

                        string name = varDecl.ID().GetText();

                        string type = varDecl.children[0].GetText();

                        string value = varDecl.expr()?.GetText();

                        if (!globalVarNames.Add(name))
                        {
                            string errorMessage = $"Eroare: Variabila globală \"{name}\" a fost deja declarată.";

                            errorMessages.Add(errorMessage);

                            writer.WriteLine(errorMessage);
                        }
                        else
                        {
                            if (value != null && !IsCompatibleType(type, value))
                            {
                                string errorMessage = $"Eroare: Tip incompatibil pentru atribuirea valorii \"{value}\" la variabila globală \"{name}\" de tip {type}.";

                                errorMessages.Add(errorMessage);

                                writer.WriteLine(errorMessage);

                            }
                            writer.WriteLine($"Variabila globală: {name}, Tip: {type}, Valoare: {value ?? "null"}");
                        }
                    }
                }
            }
        }

        static bool IsCompatibleType(string variableType, string value)
        {
            if (variableType == "int" && int.TryParse(value, out _))
                return true;

            if (variableType == "float" && float.TryParse(value, out _))
                return true;

            if (variableType == "string" && value.StartsWith("\"") && value.EndsWith("\""))
                return true;

            if (value.Contains("+") || value.Contains("-") || value.Contains("*") || value.Contains("/"))
            {
                return variableType == "int" || variableType == "float";
            }

            return false;
        }

        static void ExtractFunctions(MiniCPPParser.ProgramContext programContext)
        {
            HashSet<string> localVarNames = new HashSet<string>(); // Variabile locale
            HashSet<string> functionSignatures = new HashSet<string>(); // Semnătura funcției

            using (var writer = new StreamWriter("lexical_units.txt", append: true))
            {
                writer.WriteLine("\nLista functiilor:");

                foreach (var statement in programContext.statement())
                {
                    if (statement.funcDecl() != null)
                    {
                        var funcDecl = statement.funcDecl();

                        string returnType = funcDecl.children[0].GetText();

                        string functionName = funcDecl.ID().GetText();

                        string functionSignature = GenerateFunctionSignature(functionName, funcDecl.paramList());

                        if (functionSignatures.Contains(functionSignature))
                        {
                            writer.WriteLine($"Eroare: Funcția {functionName} cu aceiași parametri a fost deja declarată.");
                        }
                        else
                        {
                            functionSignatures.Add(functionSignature);

                            writer.WriteLine($"\nFunctie: {functionName}, Tip Returnat: {returnType}");

                            HashSet<string> paramNames = new HashSet<string>();

                            if (funcDecl.paramList() != null)
                            {
                                writer.WriteLine("\tParametri:");

                                foreach (var param in funcDecl.paramList().param())
                                {
                                    string paramType = param.children[0].GetText();

                                    string paramName = param.ID().GetText();

                                    writer.WriteLine($"\t\t{paramName}: {paramType}");

                                    paramNames.Add(paramName);
                                }
                            }

                            if (funcDecl.block() != null)
                            {
                                localVarNames.Clear();                     // reseteaza var locale pt fiecare funct
                                foreach (var funcStatement in funcDecl.block().statement())
                                {
                                    if (funcStatement.varDecl() != null)
                                    {
                                        var varDecl = funcStatement.varDecl();

                                        string name = varDecl.ID().GetText();

                                        if (paramNames.Contains(name))
                                        {
                                            writer.WriteLine($"Eroare: Variabila locală \"{name}\" are același nume cu un parametru al funcției.");
                                        }

                                        if (!localVarNames.Add(name))
                                        {
                                            string errorMessage = $"Eroare: Variabila locală \"{name}\" a fost deja declarată în funcție.";

                                            writer.WriteLine(errorMessage);
                                        }
                                        else
                                        {
                                            string type = varDecl.children[0].GetText();

                                            writer.WriteLine($"\tVariabila locala: {name}, Tip: {type}");
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        static string GenerateFunctionSignature(string functionName, MiniCPPParser.ParamListContext paramList)
        {
            if (paramList == null) return $"{functionName}()";  // funct fara parametri 

            var paramTypes = paramList?.param().Select(p => p.children[0].GetText()).ToList();

            string paramSignature = paramTypes != null ? string.Join(",", paramTypes) : "";

            return $"{functionName}({paramSignature})";
        }

        static void CheckForErrors(List<string> errorMessages)
        {
            using (var writer = new StreamWriter("lexical_units.txt", append: true))
            {
                writer.WriteLine("\nRaport erori:");

                if (errorMessages.Count > 0)
                {
                    writer.WriteLine($"Erori detectate: {errorMessages.Count}");

                    Console.WriteLine($"Erori detectate: {errorMessages.Count}");

                    foreach (var error in errorMessages)
                    {
                        writer.WriteLine(error);

                        Console.WriteLine(error);
                    }
                }
                else
                {
                    writer.WriteLine("Nu au fost detectate erori sintactice.");

                    Console.WriteLine("No issues found!");
                }
            }
        }

        static void ExtractStructures(MiniCPPParser.ProgramContext programContext)
        {
            using (var writer = new StreamWriter("lexical_units.txt"))
            {
                writer.WriteLine("\nLista structurilor:");

                foreach (var statement in programContext.statement())
                {
                    if (statement.structDecl() != null)
                    {
                        var structDecl = statement.structDecl();

                        string structName = structDecl.ID().GetText();

                        writer.WriteLine($"\nStructura: {structName}");

                        foreach (var member in structDecl.children)
                        {
                            if (member is MiniCPPParser.VarDeclContext varDecl)
                            {
                                string type = varDecl.children[0].GetText();

                                string name = varDecl.ID().GetText();

                                writer.WriteLine($"\tCamp: {name}, Tip: {type}");
                            }
                            else if (member is MiniCPPParser.FuncDeclContext funcDecl)
                            {
                                string funcName = funcDecl.ID().GetText();

                                string returnType = funcDecl.children[0].GetText();

                                writer.WriteLine($"\tFunctie: {funcName}, Tip returnat: {returnType}");
                            }
                        }
                    }
                }
            }
        }

        static bool IsRecursive(MiniCPPParser.FuncDeclContext funcDecl)
        {
            string funcName = funcDecl.ID().GetText();

            var block = funcDecl.block();

            if (block == null)
            {
                return false;
            }

            return block.statement().Any(stmt => stmt.funcCall() != null && stmt.funcCall().ID().GetText() == funcName);
        }

        static void VerifyVariableUsage(MiniCPPParser.ProgramContext programContext, HashSet<string> globalVarNames)
        {
            foreach (var statement in programContext.statement())
            {
                if (statement.assignment() != null)
                {
                    var assignment = statement.assignment();

                    var expression = assignment.expr();

                    Console.WriteLine($"Expresie găsită: {expression.GetText()}");
                }
            }
        }

        static void VerifyUnusedVariables(HashSet<string> declaredVariables, MiniCPPParser.ProgramContext programContext)
        {
            HashSet<string> usedVariables = new HashSet<string>();

            foreach (var statement in programContext.statement())
            {
                if (statement.expr() != null)
                {
                    var exprText = statement.expr().GetText();

                    foreach (var variable in declaredVariables)
                    {
                        if (exprText.Contains(variable))
                        {
                            usedVariables.Add(variable);
                        }
                    }
                }
            }

            var unusedVariables = declaredVariables.Except(usedVariables);

            foreach (var variable in unusedVariables)
            {
                Console.WriteLine($"Avertisment: Variabila \"{variable}\" este declarată, dar nu este utilizată.");
            }
        }

        static void CheckForUnresolvedFunctionCalls(MiniCPPParser.ProgramContext programContext, HashSet<string> functionNames)
        {
            foreach (var statement in programContext.statement())
            {
                if (statement.funcCall() != null)
                {
                    string functionName = statement.funcCall().ID().GetText();

                    if (!functionNames.Contains(functionName))
                    {
                        Console.WriteLine($"Eroare: Funcția {functionName} nu a fost definită.");
                    }
                }
            }
        }

    }

    public class CustomErrorListener : BaseErrorListener
    {
        private readonly List<string> errorMessages;

        public CustomErrorListener(List<string> errorMessages)
        {
            this.errorMessages = errorMessages;
        }

        public override void SyntaxError(TextWriter output, IRecognizer recognizer, IToken offendingSymbol, int line, int charPositionInLine, string msg, RecognitionException e)
        {
            string errorMessage = $"Eroare la linia {line}, coloana {charPositionInLine}: {msg}";
            errorMessages.Add(errorMessage);
        }
    }
}
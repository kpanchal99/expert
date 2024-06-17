
<%@page import="java.util.List"%>
<%@page import="com.mycompany.practical_4.Question"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Online Quiz</title>
    </head>
    <body>
        <h2>Online Quiz</h2>
        <form action="SubmitQuizServlet" method="post">
            <%
                List<Question> questions = (List<Question>) session.getAttribute("questions");
                int currentQuestionIndex = (int) session.getAttribute("currentQuestionIndex");
                if (currentQuestionIndex < questions.size()) {
                    Question currentQuestion = questions.get(currentQuestionIndex);
            %>
            <p><strong>Question <%= currentQuestion.getId()%>:</strong> <%= currentQuestion.getQuestionText()%></p>
            <p>
                <input type="radio" name="answer" value="A"> <%= currentQuestion.getOptionA()%><br>
                <input type="radio" name="answer" value="B"> <%= currentQuestion.getOptionB()%><br>
                <input type="radio" name="answer" value="C"> <%= currentQuestion.getOptionC()%><br>
            </p>
            <input type="submit" value="Next">
            <%
            } else {
                int score = (int) session.getAttribute("score");
            %>
            <p>Quiz completed! Your score is <%= score%> out of <%= questions.size()%>.<h3><a href="/FoundationModule/QuizServlet">Play it again !</a><h3></p>
                    <%
                        }
                    %>
            </form>
            </body>
            </html>
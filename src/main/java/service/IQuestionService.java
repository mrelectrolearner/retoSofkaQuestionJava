package service;

public interface IQuestionService {

    /**
     * select randomly a question.
     */
    void selectQuestion();

    /**
     * show a question.
     */
    void showQuestion();

    /**
     * show the list of options.
     */
    void showOptions();

    /**
     * check the answer.
     */
    void checkAnswer();
}

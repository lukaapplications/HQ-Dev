package com.lukaapplications.heroquest.model.quest;

public class QuestionQuest extends Quest {

    public String Question;
    public String Answer;

    public QuestionQuest(String question, String answer) {
        Question = question;
        Answer = answer;
        Type = QuestTypeEnum.Question;
    }
}

package com.indy.dcdrake.dementiaquiz;

import java.util.ArrayList;

/**
 * Created by dcdrake on 6/17/17.
 */

public class QuestionManager {
    private ArrayList<MultipleChoiceQuestion> questions = new ArrayList<MultipleChoiceQuestion>();

    QuestionManager()
    {
        MultipleChoiceQuestion q1 =
                new MultipleChoiceQuestion("Go close to the person and extend your hand to the person. Say: 'Hello'");

        q1.addAnswerChoice("answers 'hello' and takes the extended hand to greet spontaneously", -1);
        q1.addAnswerChoice("takes the extended hand without saying anything", -1);
        q1.addAnswerChoice("says 'hello' or nods, but doesn't take the extended hand", -1);
        q1.addAnswerChoice("only looks at the administrator", -1);
        q1.addAnswerChoice("no response", -1);
        questions.add(q1);

        MultipleChoiceQuestion q2 =
                new MultipleChoiceQuestion("Introduce yourself Say: My name is <say your first and last name very clearly>");

        q2.addAnswerChoice("says his/her name spontaneously", -1);
        q2.addAnswerChoice("if no answer, ask What's your name? (Score for first and last name)", -1);
        q2.addAnswerChoice("repeats the administrator's name", -1);
        q2.addAnswerChoice("only looks at the administrator and/or tries to say something that cannot be interpreted", -1);
        q2.addAnswerChoice("no response", -1);
        questions.add(q2);

        MultipleChoiceQuestion q3 =
                new MultipleChoiceQuestion("Ask 'How are you today?'");

        q3.addAnswerChoice("answers question with a single word (well/bad/ok)", -1);
        q3.addAnswerChoice("doesn't answer spontaneously, but when asked 'are you ok?', he/she answers 'yes' or 'no'", -1);
        q3.addAnswerChoice("tries to answer, but words cannot be interpreted", -1);
        q3.addAnswerChoice("only eye contact, but it shows that he/she understands he/she is the person being addressed", -1);
        q3.addAnswerChoice("no response", -1);
        questions.add(q3);


        MultipleChoiceQuestion q4 =
                new MultipleChoiceQuestion("Put three objects in front of the person (e.g. a pencil, key and wristwatch). Show and name the objects and at the same time, put them away again. Ask: What objects did I just name?");

        q4.addAnswerChoice("repeats the names of each object properly", 4);
        q4.addAnswerChoice("repeats the names of two of the objects", 3);
        q4.addAnswerChoice("repeats the name of one of the objects", 2);
        q4.addAnswerChoice("tries to repeat but cannot name any of the objects (i.e. because of impaired verbal ability", 1);
        q4.addAnswerChoice("no response", 0);
        questions.add(q4);

        MultipleChoiceQuestion q5 =
                new MultipleChoiceQuestion("Show the person a piece of paper with these words: 'Close your eyes'. Say 'I want to read loudly and then do what is written here'");

        q5.addAnswerChoice("reads loudly and closes his/her eyes", 4);
        q5.addAnswerChoice("doesn't read loudly, but closes his/her eyes", 3);
        q5.addAnswerChoice("reads loudly, but doesn't close his/her eyes", 2);
        q5.addAnswerChoice("if no response, repeat the instructions, 'I want you to do what's written on the paper' and the administrator reads the words loudly: 'close your eyes', and then the person closes his/her eyes", 1);
        q5.addAnswerChoice("the administrator repeats the instructions and reads the words, but gets no response", 0);
        questions.add(q5);
    }


    public MultipleChoiceQuestion getQuestionByIndex(int index)
    {
        return questions.get(index);
    }
}

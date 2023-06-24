module academy.learnprogramming.jokeserver.programmer {
    requires academy.learnprogramming.jokeserver;
    requires java.sql;

    // Not needed when there is a provides with directive!!
//    exports academy.learnprogramming.jokeserver.programmer;

    // This tells the Module system that this Module provides the JokerServer Interface with a service implementation!!!
    provides academy.learnprogramming.jokeserver.JokeServer
            with academy.learnprogramming.jokeserver.programmer.ProgrammerJokeServer;
}
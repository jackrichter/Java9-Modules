module academy.learnprogramming.jokeapp {
    requires academy.learnprogramming.jokeserver;

//    requires  academy.learnprogramming.jokeserver.programmer;
//    requires academy.learnprogramming.jokeserver.kid;

    // This module uses the services provided by the implementations of the JokeServer Interface!
    uses academy.learnprogramming.jokeserver.JokeServer;
}
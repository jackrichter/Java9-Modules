module academy.learnprogramming.jokeserver.kid {
    requires academy.learnprogramming.jokeserver;

    // Not needed when there is a provides with directive!!
//    exports academy.learnprogramming.jokeserver.kid;

    // This tells the Module system that this Module provides the JokerServer Interface with a service implementation!!!
    provides academy.learnprogramming.jokeserver.JokeServer
            with academy.learnprogramming.jokeserver.kid.KidJokeServer;
}
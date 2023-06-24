module academy.learnprogramming.jokeapp.ui {
    requires academy.learnprogramming.jokeserver;

    requires javafx.graphics;
    requires javafx.fxml;
    requires javafx.controls;

//    requires  academy.learnprogramming.jokeserver.programmer;
//    requires academy.learnprogramming.jokeserver.kid;

    // This module uses the services provided by the implementations of the JokeServer Interface!
    uses academy.learnprogramming.jokeserver.JokeServer;

    // We need to open up our package to these two modules for Reflection access (not more than this two JavaFX modules needs to have access)!!!
    opens academy.learnprogramming.jokeapp.ui
            to javafx.fxml, javafx.graphics;
}
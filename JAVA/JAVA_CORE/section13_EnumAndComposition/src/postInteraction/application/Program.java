package postInteraction.application;

// Manually instantiate (hard code) the objects
// shown below and show them on the terminal screen
//
// Instancie manualmente (hard code) os objetos
// mostrados abaixo e mostre-os na tela do terminal

import postInteraction.entities.Comment;
import postInteraction.entities.Post;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args) {

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime d1 = LocalDateTime.parse("03/03/2024 13:05:44",fmt);
        LocalDateTime d2 = LocalDateTime.parse("28/07/2024 23:14:19",fmt);


        Comment comment1 = new Comment("Have a nice trip!");
        Comment comment2 = new Comment("Wow that's awesome!");
        Comment comment3 = new Comment("Good night");
        Comment comment4 = new Comment("May the force be with you");

        Post post1 = new Post(d1,
                "Traveling to New Zealand",
                "I'm going to visit this wonderful country!",
                12);

        Post post2 = new Post(d2,"Good night guys","See you tomorrow",5);



        post1.addComment(comment1);
        post1.addComment(comment2);

        post2.addComment(comment3);
        post2.addComment(comment4);

        System.out.println("\n"+post1);
        System.out.println(post2);
    }
}

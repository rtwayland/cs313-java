package com.mycompany.discussionthread;

//~--- JDK imports ------------------------------------------------------------
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileCommentHandler implements CommentDataHandler {

    private String fileName;

    public FileCommentHandler(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void addComment(Comment comment) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(getFileName(), true));

            writer.write(comment.toFileString() + "\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Comment> getComments() {
        List<Comment> list = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(getFileName()));
            String line;

            while ((line = reader.readLine()) != null) {
                Comment comment = new Comment();

                comment.loadFromFileString(line);
                list.add(comment);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return list;
    }
}

package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;


public class Controller {
    public Pane pnlGame;
    public Button btnNewGame;
    public Button btnExit;
    public ImageView img1;
    public ImageView img2;
    public ImageView img3;
    public ImageView img4;
    public ImageView img5;
    public ImageView img6;
    public ImageView img7;
    public ImageView img8;
    public ImageView img9;
    public ImageView img10;
    public ImageView img11;
    public ImageView img12;
    public ImageView img13;
    public ImageView img14;
    public ImageView img15;
    public ImageView img16;
    private State state = State.NEW;
    private boolean[][] field;

    public void processClick(int i) {
        System.out.println("You cliccked on " + i);
    }

    public void img1Click(MouseEvent mouseEvent) {
        processClick(1);
    }

    public void img2Click(MouseEvent mouseEvent) {
        processClick(2);
    }

    public void img3Click(MouseEvent mouseEvent) {
        processClick(3);
    }

    public void img4Click(MouseEvent mouseEvent) {
        processClick(4);
    }

    public void img5Click(MouseEvent mouseEvent) {
        processClick(5);
    }

    public void img6Click(MouseEvent mouseEvent) {
        processClick(6);
    }

    public void img7Click(MouseEvent mouseEvent) {
        processClick(7);
    }

    public void img8Click(MouseEvent mouseEvent) {
        processClick(8);
    }

    public void img9Click(MouseEvent mouseEvent) {
        processClick(9);
    }

    public void img10Click(MouseEvent mouseEvent) {
        processClick(10);
    }

    public void img11Click(MouseEvent mouseEvent) {
        processClick(11);
    }

    public void img12Click(MouseEvent mouseEvent) {
        processClick(12);
    }

    public void img13Click(MouseEvent mouseEvent) {
        processClick(13);
    }

    public void img14Click(MouseEvent mouseEvent) {
        processClick(14);
    }

    public void img15Click(MouseEvent mouseEvent) {
        processClick(15);
    }

    public void img16Click(MouseEvent mouseEvent) {
        processClick(16);
    }
    public void btnNewClick(ActionEvent actionEvent)
    {
        state=State.Playing;
        for(int i=0; i<4;i++)
        {
            for(int j=0;j<4;j++)
                field[i][j]=false;
        }
    }
    public void toggle(int i)
    {
        int col=(i-1)%4;
        int row=(i-1)/4;
        field [row][col]=!field[row][col];
        Image image;
        System.out.println(img10.getImage().impl_getUrl());
        String current = new java.io.File()
    }
}

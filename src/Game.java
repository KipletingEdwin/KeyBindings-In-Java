import javax.swing.*;
import java.awt.event.ActionEvent;

public class Game {

    JFrame frame;
    JLabel label;

    Action upAction;
    Action downAction;
    Action ledtAction;
    Action rightAction;

    Game(){
        frame = new JFrame("KeyBinding Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);

    }

    public  class  UpAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }

    public  class  DownAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }

    public  class  LeftAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }

    public  class  RightAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }
}

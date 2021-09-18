import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentGPA {
    private JTextField textStuName;
    private JTextField textStuID;
    private JButton btnGetGrade;
    private JTextField txtTerm;
    private JTextField txtCourse1;
    private JTextField txtCourse2;
    private JTextField txtCourse3;
    private JTextField txtTotalCrd;
    private JTextField txtGPA;
    private JPanel Main;

    public static void main(String[] args) {
        JFrame frame = new JFrame("StudentGPA");
        frame.setContentPane(new StudentGPA().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public StudentGPA() {
        btnGetGrade.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int total;
                double c1, c2, c3, avg;

                c1 = Double.parseDouble(txtCourse1.getText());
                c2 = Double.parseDouble(txtCourse2.getText());
                c3 = Double.parseDouble(txtCourse3.getText());
                total = Integer.parseInt(txtTotalCrd.getText());

                avg = ((c1 + c2 + c3) / total) * 5;

                txtGPA.setText(String.valueOf(avg));
            }
        });
    }
}

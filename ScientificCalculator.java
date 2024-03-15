import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
//import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.*;  
import java.util.LinkedList;

class SimpleCalculator{
    public JFrame frame;
    public JLabel previous_value;
    public String previous = "0";
    public JTextField text;
    public JTextField text_operator;
    public JButton btn1;
    public JButton btn2;
    public JButton btn3;
    public JButton btn4;
    public JButton btn5;
    public JButton btn6;
    public JButton btn7;
    public JButton btn8;
    public JButton btn9;
    public JButton btn10;
    public JButton btn11;
    public JButton btn12;
    public JButton btn13;
    public JButton btn14;
    public JButton btn15;
    public JButton btn16;
    public JButton btn17;
    public JButton btn18;
    public JButton btn19;
    public JButton btn20;
    public Font font;
    public double firstoperand = 0;
    public String operator = "";
    public double result = 0;
    public double initial = 0;
    //LinkedList<Double> input_values = new LinkedList<Double>();
    LinkedList<Double> results = new LinkedList<Double>();
    public SimpleCalculator(){
        frame = new JFrame();
        frame.setTitle("CALCULATOR");

        previous_value = new JLabel();
        previous_value.setBounds(5,0,50,15);
        frame.add(previous_value);

        text = new JTextField(20);
        text.setBounds(5,13,260,27);
        frame.add(text);

        text_operator = new JTextField();
        text_operator.setBounds(270,10,19,30);
        frame.add(text_operator);



        font = new Font("Arial",Font.BOLD,15);

        this.button();

        frame.setLayout(null);
        frame.setSize(320,210);
        frame.setVisible(true);//must in end
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void button(){
        btn1 = new JButton("7");
        btn1.setBounds(5,40,50,30);//(x,y,width,height)
        btn1.setFont(font);
        btn1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                text.setText(text.getText().concat("7"));
            }
        });
        frame.add(btn1);

        btn2 = new JButton("8");
        btn2.setBounds(55,40,50,30);//(x,y,width,height)
        btn2.setFont(font);
        btn2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                text.setText(text.getText().concat("8"));
            }
        });
        frame.add(btn2);

        btn3 = new JButton("9");
        btn3.setBounds(105,40,50,30);//(x,y,width,height)
        btn3.setFont(font);
        btn3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                text.setText(text.getText().concat("9"));
            }
        });
        frame.add(btn3);

        btn4 = new JButton("DEL");
        btn4.setBounds(155,40,70,30);//(x,y,width,height)
        btn4.setFont(font);
        btn4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
               
            } 
        });
        frame.add(btn4);

        btn5 = new JButton("AC");
        btn5.setBounds(220,40,70,30);//(x,y,width,height)
        btn5.setFont(font);
        btn5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                text.setText("");
                text_operator.setText("");
                result=0;
                initial = 0;
                previous_value.setText("0");
            }
        });
        frame.add(btn5);

        btn6 = new JButton("4");
        btn6.setBounds(5,70,50,30);//(x,y,width,height)
        btn6.setFont(font);
        btn6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                text.setText(text.getText().concat("4"));
            }
        });
        frame.add(btn6);

        btn7 = new JButton("5");
        btn7.setBounds(55,70,50,30);//(x,y,width,height)
        btn7.setFont(font);
        btn7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                text.setText(text.getText().concat("5"));
            }
        });
        frame.add(btn7);

        btn8 = new JButton("6");
        btn8.setBounds(105,70,50,30);//(x,y,width,height)
        btn8.setFont(font);
        btn8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                text.setText(text.getText().concat("6"));
            }
        });
        frame.add(btn8);

        btn9 = new JButton("X");
        btn9.setBounds(155,70,70,30);//(x,y,width,height)
        btn9.setFont(font);
        btn9.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                firstoperand = Double.parseDouble(text.getText());
                operator = "*";
                text.setText("");
                text_operator.setText(" X");
                initial *= firstoperand;   
                previous_value.setText(Double.toString(initial));
            }
        });
        frame.add(btn9);

        btn10 = new JButton("/");
        btn10.setBounds(220,70,70,30);//(x,y,width,height)
        btn10.setFont(font);
        btn10.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                firstoperand = Double.parseDouble(text.getText());
                operator = "/";
                text.setText("");
                text_operator.setText(" /");
                initial /= firstoperand;   
                previous_value.setText(Double.toString(initial));
            }
        });
        frame.add(btn10);

        btn11 = new JButton("1");
        btn11.setBounds(5,100,50,30);//(x,y,width,height)
        btn11.setFont(font);
        btn11.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                text.setText(text.getText().concat("1"));
            }
        });
        frame.add(btn11);

        btn12 = new JButton("2");
        btn12.setBounds(55,100,50,30);//(x,y,width,height)
        btn12.setFont(font);
        btn12.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                text.setText(text.getText().concat("2"));
            }
        });
        frame.add(btn12);

        btn13 = new JButton("3");
        btn13.setBounds(105,100,50,30);//(x,y,width,height)
        btn13.setFont(font);
        btn13.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                text.setText(text.getText().concat("3"));
            }
        });
        frame.add(btn13);

        btn14 = new JButton("+");
        btn14.setBounds(155,100,70,30);//(x,y,width,height)
        btn14.setFont(font);
        btn14.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                firstoperand = Double.parseDouble(text.getText());
                operator = "+";
                text.setText("");
                text_operator.setText(" +");
                 initial += firstoperand;   
                previous_value.setText(Double.toString(initial));
                //input_values.add(initial); 
            }
        });
        frame.add(btn14);

        btn15 = new JButton("-");
        btn15.setBounds(220,100,70,30);//(x,y,width,height)
        btn15.setFont(font);
        btn15.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                firstoperand = Double.parseDouble(text.getText());
                operator = "-";
                text.setText("");
                text_operator.setText(" -");
                initial -= firstoperand;   
                previous_value.setText(Double.toString(initial));
            }
        });
        frame.add(btn15);

        btn16 = new JButton("0");
        btn16.setBounds(5,130,50,30);//(x,y,width,height)
        btn16.setFont(font);
        btn16.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                text.setText(text.getText().concat("0"));
            }
        });
        frame.add(btn16);

        btn17 = new JButton(".");
        btn17.setBounds(55,130,50,30);//(x,y,width,height)
        btn17.setFont(font);
        btn17.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                text.setText(text.getText().concat("."));
            }
        });
        frame.add(btn17);

        btn18 = new JButton("00");
        btn18.setBounds(105,130,50,30);//(x,y,width,height)
        btn18.setFont(font);
        btn18.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                text.setText(text.getText().concat("00"));
            }
        });
        frame.add(btn18);

        btn19 = new JButton("ANS");
        btn19.setBounds(155,130,70,30);//(x,y,width,height)
        btn19.setFont(font);
        btn19.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
            }
        });
        frame.add(btn19);

        btn20 = new JButton("=");
        btn20.setBounds(220,130,70,30);//(x,y,width,height)
        btn20.setFont(font);
        btn20.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                //previous_value.setText(Double.toString(firstoperand));
                double secondoperand = Double.parseDouble(text.getText());
                switch (operator) {
                    case "+":
                        result = Double.parseDouble(previous_value.getText()) + secondoperand;
                        //results.add(result);
                        break;
                    case "-":
                        result = Double.parseDouble(previous_value.getText()) - secondoperand;
                        //results.add(result);
                        break;
                    case "*":
                        result = Double.parseDouble(previous_value.getText()) * secondoperand;
                        //results.add(result);
                        break;
                    case "/":
                        result = Double.parseDouble(previous_value.getText()) / secondoperand;
                        //results.add(result);
                        break;
                    // Add cases for other operators here
                }
                previous_value.setText(Double.toString(result));
                text.setText(Double.toString(result));
                //previous = Double.toString(result);
            }
        });
        frame.add(btn20);

    }
}
public class ScientificCalculator {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        @SuppressWarnings("unused")
        SimpleCalculator test1 = new SimpleCalculator();
    }
}
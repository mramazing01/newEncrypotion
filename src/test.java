
import javax.swing.*;
import java.io.IOException;

class test {
    private JPanel dave;
    private JButton caesarButton;
    private JButton vernamButton;
    private JButton vignereButton;
    private JButton pictureButton;
    private JTextField messBox;
    private JTextField keyBox;
    private JTextField outBox;
    private JComboBox comboBox1;

    private test() {
        caesarButton.addActionListener(actionEvent -> {
            try{
                String a= messBox.getText();
                String b= keyBox.getText();
                encryption enc = new encryption();
                enc.setPlainText(a);
                enc.setKey(b);
                int box=comboBox1.getSelectedIndex();
                if(box==0){
                    enc.encrypt();
                }else{
                    enc.decrypt();
                }

                String temp=enc.cyphertext;
                temp=temp.replace("null","");
                outBox.setText(temp);
            }catch(Exception e){
                outBox.setText("Something went wrong - try again");
            }


        });
        vernamButton.addActionListener(actionEvent -> {
            try{
                String a= messBox.getText();
                String b= keyBox.getText();
                vernam ver = new vernam();
                ver.setPlainText(a);
                ver.setKey(b);
                int box=comboBox1.getSelectedIndex();
                if(box==0){
                    ver.encrypt();
                }else{
                    ver.decrypt();
                }
                String temp=ver.cyphertext;
                temp=temp.replace("null","");
                outBox.setText(temp);
            }catch(Exception e){
                outBox.setText("Something went wrong - try again");
            }
        });
        vignereButton.addActionListener(actionEvent -> {
            try{
                String a= messBox.getText();
                String b= keyBox.getText();
                vignere vig = new vignere();
                vig.setPlainText(a);
                vig.setKey(b);
                int box=comboBox1.getSelectedIndex();
                if(box==0){
                    vig.encrypt();
                }else{
                    vig.decrypt();
                }
                String temp=vig.cyphertext;
                temp=temp.replace("null","");
                outBox.setText(temp);
            }catch(Exception e){
                outBox.setText("Something went wrong - try again");
                System.out.println(e);
            }

        });
        pictureButton.addActionListener(actionEvent -> {
            try{
                String a= messBox.getText();
                String b= keyBox.getText();
                String c= outBox.getText();
                pic pi=new pic();
                int box=comboBox1.getSelectedIndex();
                try {
                    if(box==0){
                        pi.encrypt(b,a,c);
                    }else if(box==1){
                        pi.decrypt(b);
                        String x=pi.finalWord;
                        outBox.setText(x);
                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }catch(Exception e){
                outBox.setText("Something went wrong - try again");
                System.out.println(e);
            }

        });
    }

    public static void h(){
        JFrame frame = new JFrame();
        frame.setContentPane(new test().dave);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setTitle("Encrypter/Decrypter program");
    }
}

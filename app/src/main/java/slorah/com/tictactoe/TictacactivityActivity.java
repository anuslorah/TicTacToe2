package slorah.com.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TictacactivityActivity extends AppCompatActivity {

    Button b00, b01, b02, b10, b11, b12, b20, b21, b22;
    TextView info;
    Button start;
    int turn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tictacactivity);

        b00 = (Button) findViewById(R.id.button00);
        b01 = (Button) findViewById(R.id.button01);
        b02 = (Button) findViewById(R.id.button02);
        b10 = (Button) findViewById(R.id.button10);
        b11 = (Button) findViewById(R.id.button11);
        b12 = (Button) findViewById(R.id.button12);
        b20 = (Button) findViewById(R.id.button20);
        b21 = (Button) findViewById(R.id.button21);
        b22 = (Button) findViewById(R.id.button22);
        info = (TextView) findViewById(R.id.winner);
        start = (Button) findViewById(R.id.start);

        turn = 1;

        start.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                clearBoard();
            }
        });
        info.setText("Player X's turn");
        b00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b00.getText().toString().equals("")) {
                    if (turn == 1) {
                        info.setText("Player O's turn");
                        turn = 2;
                        b00.setText("X");
                    } else if (turn == 2) {
                        info.setText("Player X's turn");
                        turn = 1;
                        b00.setText("O");
                    }
                }
                endGame();
            }
        });
        b01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b01.getText().toString().equals("")) {
                    if (turn == 1) {
                        info.setText("Player O's turn");
                        turn = 2;
                        b01.setText("X");
                    } else if (turn == 2) {
                        info.setText("Player X's turn");
                        turn = 1;
                        b01.setText("O");
                    }
                }
                endGame();
            }
        });
        b02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b02.getText().toString().equals("")) {
                    if (turn == 1) {
                        info.setText("Player O's turn");
                        turn = 2;
                        b02.setText("X");
                    } else if (turn == 2) {
                        info.setText("Player X's turn");
                        turn = 1;
                        b02.setText("O");
                    }
                }
                endGame();
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b10.getText().toString().equals("")) {
                    if (turn == 1) {
                        info.setText("Player O's turn");
                        turn = 2;
                        b10.setText("X");
                    } else if (turn == 2) {
                        info.setText("Player X's turn");
                        turn = 1;
                        b10.setText("O");
                    }
                }
                endGame();
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b11.getText().toString().equals("")) {
                    if (turn == 1) {
                        info.setText("Player O's turn");
                        turn = 2;
                        b11.setText("X");
                    } else if (turn == 2) {
                        info.setText("Player X's turn");
                        turn = 1;
                        b11.setText("O");
                    }
                }
                endGame();
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b12.getText().toString().equals("")) {
                    if (turn == 1) {
                        info.setText("Player O's turn");
                        turn = 2;
                        b12.setText("X");
                    } else if (turn == 2) {
                        info.setText("Player X's turn");
                        turn = 1;
                        b12.setText("O");
                    }
                }
                endGame();
            }
        });
        b20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b20.getText().toString().equals("")) {
                    if (turn == 1) {
                        info.setText("Player O's turn");
                        turn = 2;
                        b20.setText("X");
                    } else if (turn == 2) {
                        info.setText("Player X's turn");
                        turn = 1;
                        b20.setText("O");
                    }
                }
                endGame();
            }
        });
        b21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b21.getText().toString().equals("")) {
                    if (turn == 1) {
                        info.setText("Player O's turn");
                        turn = 2;
                        b21.setText("X");
                    } else if (turn == 2) {
                        info.setText("Player X's turn");
                        turn = 1;
                        b21.setText("O");
                    }
                }
                endGame();
            }
        });
        b22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b22.getText().toString().equals("")) {
                    if (turn == 1) {
                        info.setText("Player O's turn");
                        turn = 2;
                        b22.setText("X");
                    } else if (turn == 2) {
                        info.setText("Player X's turn");
                        turn = 1;
                        b22.setText("O");
                    }
                }
                endGame();
            }
        });
    }
    public void endGame(){
        String s00, s01, s02, s10, s11, s12, s20, s21, s22;
        s00 = b00.getText().toString();
        s01 = b01.getText().toString();
        s02 = b02.getText().toString();
        s10 = b10.getText().toString();
        s11 = b11.getText().toString();
        s12 = b12.getText().toString();
        s20 = b20.getText().toString();
        s21 = b21.getText().toString();
        s22 = b22.getText().toString();

        if (s00.equals(s01) && s00.equals(s02) && s00.equals("X")){
            info.setText("Player X wins!");
        }
        else if (s00.equals(s01) && s00.equals(s02) && s00.equals("O")){
            info.setText("Player O wins!");
        }
        else if (s10.equals(s11) && s10.equals(s12) && s10.equals("X")){
            info.setText("Player X wins!");
        }
        else if (s10.equals(s11) && s10.equals(s12) && s10.equals("O")){
            info.setText("Player O wins!");
        }
        else if (s20.equals(s21) && s20.equals(s22) && s20.equals("X")){
            info.setText("Player X wins!");
        }
        else if (s20.equals(s21) && s20.equals(s22) && s20.equals("O")){
            info.setText("Player O wins!");
        }
        else if (s00.equals(s10) && s00.equals(s20) && s20.equals("X")){
            info.setText("Player X wins!");
        }
        else if (s00.equals(s10) && s00.equals(s20) && s20.equals("O")){
            info.setText("Player O wins!");
        }
        else if (s01.equals(s11) && s01.equals(s21) && s01.equals("X")){
            info.setText("Player X wins!");
        }
        else if (s01.equals(s11) && s01.equals(s21) && s01.equals("O")){
            info.setText("Player O wins!");
        }
        else if (s02.equals(s12) && s02.equals(s22) && s02.equals("X")){
            info.setText("Player X wins!");
        }
        else if (s02.equals(s12) && s02.equals(s22) && s02.equals("O")){
            info.setText("Player O wins!");
        }
        else if (s00.equals(s11) && s00.equals(s22) && s00.equals("X")){
            info.setText("Player X wins!");
        }
        else if (s00.equals(s11) && s00.equals(s22) && s00.equals("O")){
            info.setText("Player O wins!");
        }
        else if (s20.equals(s11) && s20.equals(s02) && s20.equals("X")){
            info.setText("Player X wins!");
        }
        else if (s20.equals(s11) && s20.equals(s02) && s20.equals("O")){
            info.setText("Player O wins!");
        }
        else {
            info.setText("It is a draw..");
        }
    }

    public void clearBoard(){
        b00.setText("");
        b01.setText("");
        b02.setText("");
        b10.setText("");
        b11.setText("");
        b12.setText("");
        b20.setText("");
        b21.setText("");
        b22.setText("");
        info.setText("Player X's turn");
        turn = 1;
    }
}

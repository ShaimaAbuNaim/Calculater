package com.example.abunaim.calculater;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {
    TextView answer;
    TextView input;
    String result1 = "", result2 = "";//always consider inputs as two number inputs
    float finalresult = 0;
    String operator = "";
    int addtomemory=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        answer = (TextView) findViewById(R.id.txtrslt);
        input = (TextView) findViewById(R.id.txtdisply);

        //answer.setText("Answer = ");

        Button value0 = (Button) findViewById(R.id.button0);
        Button value1 = (Button) findViewById(R.id.button1);
        Button value2 = (Button) findViewById(R.id.button2);
        Button value3 = (Button) findViewById(R.id.button3);
        Button value4 = (Button) findViewById(R.id.button4);
        Button value5 = (Button) findViewById(R.id.button5);
        Button value6 = (Button) findViewById(R.id.button6);
        Button value7 = (Button) findViewById(R.id.button7);
        Button value8 = (Button) findViewById(R.id.button8);
        Button value9 = (Button) findViewById(R.id.button9);

        //Button decimalPoint = (Button) findViewById(R.id.button2);
        Button equal = (Button) findViewById(R.id.buttonequ);
        Button add = (Button) findViewById(R.id.buttonsum);
        Button substract = (Button) findViewById(R.id.buttonsub);
        Button multiply = (Button) findViewById(R.id.buttonmul);
        Button devide = (Button) findViewById(R.id.buttonsqr);
        Button clear = (Button) findViewById(R.id.buttonc);
        Button back = (Button) findViewById(R.id.buttonbck);
        Button addmemory=(Button)findViewById(R.id.buttonaddmem);

        value0.setOnClickListener(this);
        value1.setOnClickListener(this);
        value2.setOnClickListener(this);
        value3.setOnClickListener(this);
        value4.setOnClickListener(this);
        value5.setOnClickListener(this);
        value6.setOnClickListener(this);
        value7.setOnClickListener(this);
        value8.setOnClickListener(this);
        value9.setOnClickListener(this);
        // decimalPoint.setOnClickListener(this);
        add.setOnClickListener(this);
        substract.setOnClickListener(this);
        multiply.setOnClickListener(this);
        devide.setOnClickListener(this);
        clear.setOnClickListener(this);
        back.setOnClickListener(this);
        equal.setOnClickListener(this);
        addmemory.setOnClickListener(this);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {

        // TODO Auto-generated method stub
        switch (v.getId()) {
            case R.id.button0:
                input.setText(input.getText().toString() + "0");
                result1 += "0";
                break;

            case R.id.button1:
                input.setText(input.getText().toString() + "1");
                result1 += "1";
                break;

            case R.id.button2:
                input.setText(input.getText().toString() + "2");
                result1 += "2";
                break;

            case R.id.button3:
                input.setText(input.getText().toString() + "3");
                result1 += "3";
                break;

            case R.id.button4:
                input.setText(input.getText().toString() + "4");
                result1 += "4";
                break;

            case R.id.button5:
                input.setText(input.getText().toString() + "5");
                result1 += "5";
                break;

            case R.id.button6:
                input.setText(input.getText().toString() + "6");
                result1 += "6";
                break;

            case R.id.button7:
                input.setText(input.getText().toString() + "7");
                result1 += "7";
                break;

            case R.id.button8:
                input.setText(input.getText().toString() + "8");
                result1 += "8";
                break;

            case R.id.button9:
                input.setText(input.getText().toString() + "9");
                result1 += "9";
                break;

	/*	case R.id.button2:
			input.setText(input.getText().toString()+".");
			result1 +=".";
			break;*/

            case R.id.buttonequ: //equal sign
                result2 = result1;
                if (operator.equals("+")) {
                    finalresult += Float.parseFloat(result2);
                } else if (operator.equals("-")) {
                    finalresult -= Float.parseFloat(result2);
                } else if (operator.equals("x")) {
                    finalresult *= Float.parseFloat(result2);
                } else if (operator.equals("/")) {
                    finalresult /= Float.parseFloat(result2);
                } else if (operator.equals("=")) {
                    finalresult = Float.parseFloat(answer.getText().toString());
                } else {
                    finalresult = Float.parseFloat(result2);
                }
                result1 = answer.getText().toString();
                result2 = "";
                operator = "=";//equal
                answer.setText("result" + String.valueOf(finalresult));
                break;

            case R.id.buttonsum:   //addition
                input.setText(input.getText().toString() + "+");
                result2 = result1;
                if (operator.equals("+")) {
                    finalresult += Float.parseFloat(result2);
                } else if (operator.equals("-")) {
                    finalresult -= Float.parseFloat(result2);
                } else if (operator.equals("x")) {
                    finalresult *= Float.parseFloat(result2);
                } else if (operator.equals("/")) {
                    finalresult /= Float.parseFloat(result2);
                } else if (operator.equals("=")) {
                    finalresult = Float.parseFloat(answer.getText().toString());
                } else {
                    finalresult = Float.parseFloat(result2);
                }
                result1 = "";
                result2 = "";
                operator = "+";//addition
                answer.setText(String.valueOf(finalresult));
                break;

            case R.id.buttonsub: //substraction
                input.setText(input.getText().toString() + "-");
                result2 = result1;
                if (operator.equals("+")) {
                    finalresult += Float.parseFloat(result2);
                } else if (operator.equals("-")) {
                    finalresult -= Float.parseFloat(result2);
                } else if (operator.equals("x")) {
                    finalresult *= Float.parseFloat(result2);
                } else if (operator.equals("/")) {
                    finalresult /= Float.parseFloat(result2);
                } else if (operator.equals("=")) {
                    finalresult = Float.parseFloat(answer.getText().toString());
                } else {
                    finalresult = Float.parseFloat(result2);
                }
                result1 = "";
                result2 = "";
                operator = "-";//substraction
                answer.setText(String.valueOf(finalresult));
                break;

            case R.id.buttonmul://multiplication
                input.setText(input.getText().toString() + "x");
                result2 = result1;
                if (operator.equals("+")) {
                    finalresult += Float.parseFloat(result2);
                } else if (operator.equals("-")) {
                    finalresult -= Float.parseFloat(result2);
                } else if (operator.equals("x")) {
                    finalresult *= Float.parseFloat(result2);
                } else if (operator.equals("/")) {
                    finalresult /= Float.parseFloat(result2);
                } else if (operator.equals("=")) {
                    finalresult = Float.parseFloat(answer.getText().toString());
                } else {
                    finalresult = Float.parseFloat(result2);
                }
                result1 = "";
                result2 = "";
                operator = "x";//multiplication
                answer.setText(String.valueOf(finalresult));
                break;

            case R.id.buttonsqr: //devision
                input.setText(input.getText().toString() + "/");
                result2 = result1;
                if (operator.equals("+")) {
                    finalresult += Float.parseFloat(result2);
                } else if (operator.equals("-")) {
                    finalresult -= Float.parseFloat(result2);
                } else if (operator.equals("x")) {
                    finalresult *= Float.parseFloat(result2);
                } else if (operator.equals("/")) {
                    finalresult /= Float.parseFloat(result2);
                } else if (operator.equals("=")) {
                    finalresult = Float.parseFloat(answer.getText().toString());
                } else {
                    finalresult = Float.parseFloat(result2);
                }
                result1 = "";
                result2 = "";
                operator = "/";//devision
                answer.setText(String.valueOf(finalresult));
                break;

            case R.id.buttonc: //clear
                input.setText("");
                answer.setText("");
                result1 = "";
                result2 = "";
                operator = "";
                finalresult = 0;
                break;
            case R.id.buttonbck:
                if (input.getText().toString().length() > 0) {
                    int start = 0;
                    int end = input.getText().toString().length() - 1;
                    String bcktxt = input.getText().toString().substring(start, end);
                    input.setText(bcktxt);
                    break;

                }
            case R.id.buttonaddmem:
                addtomemory=Integer.parseInt(input.getText().toString());
                Toast toast=Toast.makeText(getApplicationContext(),"the value added to memory",Toast.LENGTH_SHORT);
                toast.show();
                break;

        }
    }
}


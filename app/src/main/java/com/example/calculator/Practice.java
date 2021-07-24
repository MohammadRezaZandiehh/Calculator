//package com.example.calculator;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.Toast;
//
//public class MainActivity extends AppCompatActivity {
//    EditText editTextNumber;     // jaei k type mishe rosh
//    String operation;
//    String firstInput;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        editTextNumber = findViewById(R.id.editTextNumber);
//    }
//
//    public void keysTouched(View view) {
//        Button buttonClick = (Button) view;
//
//        switch (buttonClick.getTag().toString()) {
//            case "1":
//            case "2":
//            case "3":
//            case "4":
//            case "5":
//            case "6":
//            case "7":
//            case "8":
//            case "9":
//            case "0":
//
//                String content = editTextNumber.getText().toString();
//                editTextNumber.setText(content + buttonClick.getTag().toString());
//                //miad roo har adadi k zadim tagesh ro migirre va dakhele textbar e ma (on bala) neshon mide .
//        }
//        switch (buttonClick.getTag().toString()) {
//            case "+":
//                operation = "+";
//                firstInput = editTextNumber.getText().toString();
//                editTextNumber.setText("");
//                break;
//            case "-":
//                operation = "-";
//                firstInput = editTextNumber.getText().toString();
//                editTextNumber.setText("");
//                break;
//            case "*":
//                operation = "*";
//                firstInput = editTextNumber.getText().toString();
//                editTextNumber.setText("");
//                break;
//            case "/":
//                operation = "/";
//                firstInput = editTextNumber.getText().toString();
//                editTextNumber.setText("");
//                break;
//
//            case "=":
//
//                if (operation.equals("+")) {
//                    int input = Integer.valueOf(firstInput);
//                    int secondInput = Integer.valueOf(editTextNumber.getText().toString());
//                    int result = input + secondInput;
//                    editTextNumber.setText(String.valueOf(result));
//
//                }
//
//                if (operation.equals("*")) {
//                    int input = Integer.valueOf(firstInput);
//                    int secondInput = Integer.valueOf(editTextNumber.getText().toString());
//                    int result = input * secondInput;
//                    editTextNumber.setText(String.valueOf(result));
//
//                }
//
//                if (operation.equals("/")) {
//                    int input = Integer.valueOf(firstInput);
//                    int secondInput = Integer.valueOf(editTextNumber.getText().toString());
//                    int result = input / secondInput;
//                    editTextNumber.setText(String.valueOf(result));
//
//                }
//
//                if (operation.equals("-")) {
//                    int input = Integer.valueOf(firstInput);
//                    int secondInput = Integer.valueOf(editTextNumber.getText().toString());
//                    int result = input - secondInput;
//                    editTextNumber.setText(String.valueOf(result));
//
//                }
//
//                break;
//            case "c":
//                editTextNumber.setText("");
//                break;
//        }
//
//    }
//}
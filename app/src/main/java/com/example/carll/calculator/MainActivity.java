package com.example.carll.calculator;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private Button mClearButton;
    private Button mOpenParenthButton;
    private Button mClosedParenthButton;
    private Button mDeleteParenthButton;
    private Button mSevenButton;
    private Button mEightthButton;
    private Button mNineButton;
    private Button mSlashButton;
    private Button mFourButton;
    private Button mFiveButton;
    private Button mSixButton;
    private Button mMultiplierButton;
    private Button mOneButton;
    private Button mTwoButton;
    private Button mThreeButton;
    private Button mSubtractButton;
    private Button mZeroButton;
    private Button mDecimalButton;
    private Button mEqualsButton;
    private Button mAdditionButton;
    private TableLayout mCalculatorTable;
    private LinearLayout userEntryViewField;
    private TextView mUserEntryView;
    private TextView mUserResultsView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //final ArrayList<String> mathCalc = new ArrayList<String>();



        userEntryViewField = (LinearLayout) findViewById(R.id.user_entry_layout_view);
        userEntryViewField.setBackgroundColor(Color.WHITE);

        //mCalculatorTable = (TableLayout) findViewById(R.id.calculator_table_numbers);
        //mCalculatorTable.setBackgroundColor(Color.DKGRAY);

        mUserEntryView = (TextView) findViewById(R.id.user_entry);

        //mUserEntryView.setText(R.string.zero);

        mUserResultsView = (TextView) findViewById(R.id.user_results);

        mClearButton = (Button) findViewById(R.id.clearButton);



        mOpenParenthButton = (Button) findViewById(R.id.open_parenth);


        mClosedParenthButton = (Button) findViewById(R.id.closed_parenth);


    }

    public void display(View view) {

        switch (view.getId()) {

            case R.id.oneButton:
                updateWorkArea('1');

                break;



            case R.id.twoButton:
                updateWorkArea('2');

                break;

            case R.id.threeButton:
                updateWorkArea('3');

                break;

            case R.id.fourButton:
                updateWorkArea('4');

                break;

            case R.id.fiveButton:
                updateWorkArea('5');

                break;


            case R.id.sixButton:
                updateWorkArea('6');

                break;

            case R.id.sevenButton:
                updateWorkArea('7');

                break;


            case R.id.eightButton:
                updateWorkArea('8');

                break;

            case R.id.nineButton:
                updateWorkArea('9');

                break;

            case R.id.open_parenth:
                updateWorkArea('(');

                break;


            case R.id.closed_parenth:
                updateWorkArea(')');

                break;
            case R.id.clearButton:
                clearWorkArea();

                break;

            case R.id.additionButton:
                updateWorkArea('+');

                break;

            case R.id.subtractButton:
                updateWorkArea('-');

                break;

            case R.id.slashButton:
                updateWorkArea('/');

                break;

            case R.id.multiplierButton:
                updateWorkArea('*');

                break;

            case R.id.decimalButton:
                updateWorkArea('.');

                break;

            case R.id.equalButton:
                updateWorkArea('=');

                break;


            case R.id.backSpaceButton:
                deleteCurrentText();

                break;






        }
    }

    private void updateWorkArea(char buttonText) {
        String currentText = mUserEntryView.getText().toString();
        mUserEntryView.setText(currentText + " " + buttonText);

    }

    private void clearWorkArea() {
        mUserEntryView.setText("");
    }

    private void deleteCurrentText() {
        String textToBeDeleted = mUserEntryView.getText().toString();
        String currentText = textToBeDeleted.substring(0, textToBeDeleted.length() -2);
        mUserEntryView.setText(currentText);

    }
}

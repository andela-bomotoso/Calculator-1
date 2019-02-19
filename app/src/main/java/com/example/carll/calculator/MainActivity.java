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

        final ArrayList<String> mathCalc = new ArrayList<String>();



        userEntryViewField = (LinearLayout) findViewById(R.id.user_entry_layout_view);
        userEntryViewField.setBackgroundColor(Color.WHITE);

        //mCalculatorTable = (TableLayout) findViewById(R.id.calculator_table_numbers);
        //mCalculatorTable.setBackgroundColor(Color.DKGRAY);

        mUserEntryView = (TextView) findViewById(R.id.user_entry);

        mUserEntryView.setText(R.string.zero);

        mUserResultsView = (TextView) findViewById(R.id.user_results);

        mClearButton = (Button) findViewById(R.id.clearButton);
        mClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mUserEntryView.setText(getString(R.string.zero));
                mUserResultsView.setText(getString(R.string.zero));
            }
        });

        mOpenParenthButton = (Button) findViewById(R.id.open_parenth);

        mOpenParenthButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mathCalc.add(getString(R.string.openParenth));

                mUserEntryView.setText(mathCalc.toString());
            }
        });

        mClosedParenthButton = (Button) findViewById(R.id.closed_parenth);

        mClosedParenthButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mathCalc.add(getString(R.string.closedParenth));
                mUserEntryView.setText(mathCalc.toString());
            }
        });













    }
}

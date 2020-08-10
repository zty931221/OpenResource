package com.zty.mytest;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by zhang.tianyi on 2020/7/31 17:23
 */

public class TestToast {
    private static final String TAG = TestToast.class.getSimpleName();


    private static TestToast mInstance;

    private Context context;

    public static TestToast getInstance(Context context){
        if (mInstance == null){
            mInstance = new TestToast(context);
        }
        return mInstance;
    }

    private TestToast(Context context){
        this.context = context;
    }

    public void showTestToast(String test){
        if (test == null || test.equals("")){
            Toast.makeText(context,"你忘了传参数啊大佬",Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(context,getString(test),Toast.LENGTH_LONG).show();
        }
    }

    private String getString(String test){
        String reTest = test;
        switch (test){
            case "张天逸":
                reTest = "张天逸是英勇无敌的小可爱";
                break;
            case "王文慧":
                reTest = "王文慧是笨蛋一枚";
                break;
            case "王一喆":
                reTest = "王一喆绝对考不到驾照";
                break;
            case "谢善奇":
                reTest = "谢善奇老油条了";
                break;
            case "张跃筹":
                reTest = "张跃筹是张天逸的逆子";
                break;
            default:
                break;
        }
        return reTest;
    }
}

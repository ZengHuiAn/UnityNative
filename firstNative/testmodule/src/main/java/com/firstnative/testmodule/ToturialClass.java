package com.firstnative.testmodule;

import android.util.Log;

import com.unity3d.player.UnityPlayer;

public class ToturialClass {
    public  void LogNative()
    {
        Log.d("Unity", "LogNative: ");
    }

    public  void LogNative(String ourMsg)
    {
        Log.d("Unity", "LogNative: "+ ourMsg);
    }
    public  void LogNative(int number)
    {
        Log.d("Unity", "LogNative: "+ number);
    }

    public  int LogNativeNum(int number)
    {
        return number+2;
    }

    public  void  InvokeJavaFunc(int a)
    {
        Log.d( "Unity: ",Integer.toString(a));
        if (a ==1 )
        {
            this.DoInvokeA();
        }
        else
        {
            this.DoInvokeB();
        }
    }


    public  void DoInvokeA()
    {
        Log.d("Unity", "DoInvokeA: ");
         UnityPlayer.UnitySendMessage("SDKManager","UnityLogA","A");
    }

    public  void DoInvokeB()
    {
        Log.d("Unity", "DoInvokeB: ");
        UnityPlayer.UnitySendMessage("SDKManager","UnityLogB","B");
    }
}

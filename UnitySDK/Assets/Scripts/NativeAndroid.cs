using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class NativeAndroid : MonoBehaviour
{
    // Start is called before the first frame update
    void Start()
    {
        AndroidJavaObject native = new AndroidJavaObject("com.firstnative.testmodule.ToturialClass");

        native.Call("LogNative");
        native.Call("LogNative", " 我是native");
        native.Call("LogNative", 12313213);
        int num = native.Call<int>("LogNativeNum", 100);
        //LogNativeNum

        Debug.Log("Unity:" + num);

        native.Call("InvokeJavaFunc", 1);

        native.Call("InvokeJavaFunc", 2);
    }

    // Update is called once per frame
    void Update()
    {

    }

    public void UnityLogA(string content)
    {
        Debug.Log("UnityLogAInvoke"+ content);
    }
    public void UnityLogB(string content)
    {
        Debug.Log("UnityLogBInvoke"+ content);
    }
}

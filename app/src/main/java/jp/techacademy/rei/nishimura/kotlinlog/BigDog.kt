package jp.techacademy.rei.nishimura.kotlinlog

import android.util.Log

class BigDog: Dog {

    //superで親クラスのコンストラクタを呼ぶ
    constructor(name: String, age: Int): super(name, age){
    }

    override fun say(){
        super.say()
        Log.d("kotolintest","大きな犬です。")
    }
}
package com.busanit501.androidlabtest501.ch13_intent

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.busanit501.androidlabtest501.R
import com.busanit501.androidlabtest501.databinding.ActivityTestIntent2DetailBinding

class TestIntent2DetailActivity : AppCompatActivity() {
    lateinit var binding : ActivityTestIntent2DetailBinding
    // 2번 화면
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTestIntent2DetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.d("lsy","2번 onCreate()")

        // 1번 화면에서 넘어온 데이터 받아서, 결과 뷰에 붙이기 작업.
        // 임시 저장소에 담기.
        val email = intent.getStringExtra("email")
        val password = intent.getStringExtra("password")
        val age = intent.getStringExtra("age")
//        val age = intent.getIntExtra("age",30)

        // 데이터 확인
        Log.d("lsy","데이터 확인 2번 화면 이메일: ${email} , " +
                "패스워드: ${password}, 나이: ${age}")

        binding.resultNameView.text = "이메일 : $email"
        binding.resultEmailView.text = "패스워드 : $password"
        binding.resultAgeView.text = "나이 : $age "


        // 후처리 데이터 보내기 작업.
        // 예) 갤러리, 사진을 선택했다. 사진을 가지고 돌아감.
        binding.testBtn3.setOnClickListener {
            // 메세지 담기
            intent.putExtra("resultData","========================2번 화면에서 데이터 가져온 값.")
            // 결과 코드 담기.
            setResult(RESULT_OK, intent)
            // 현재 앱을 종료하는 함수 -> 루트 액티비티가 아니면, finish() 호출시, 모두 종료
            // 예) 1번화면(루트액티비티)에서 -> 2번화면(비루트 액티비티)으로 이동시
            finish()

        }

        // 후처리 데이터 보내기 방법2 작업.
        binding.testBtn4.setOnClickListener {
            // 메세지 담기
            intent.putExtra("result","=========방법2: 넘어옴===============2번 화면에서 데이터 가져온 값.")
            // 결과 코드 담기.
            setResult(RESULT_OK, intent)
            // 현재 앱을 종료하는 함수 -> 루트 액티비티가 아니면, finish() 호출시, 모두 종료
            // 예) 1번화면(루트액티비티)에서 -> 2번화면(비루트 액티비티)으로 이동시
            finish()

        }

    }


    override fun onStart() {
        super.onStart()
        Log.d("lsy","2번 onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.d("lsy","2번 onResume()")
    }


    override fun onPause() {
        super.onPause()
        Log.d("lsy","2번 onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.d("lsy","2번 onStop()")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("lsy","2번 onDestroy()")
    }
}
package com.jw_android.learn_modern_android.basic

class ArrayCollection {

        // 컬렉션 정리해놓은 블로그 : https://0391kjy.tistory.com/38

        // 배열 (Array) : 하나의 변수에 여러 개의 정해진 값을 담을 수 있게 해주는 데이터 타입
        // 컬렉션 ( Collection ) : 동적 배열 => list , set , map
        // 뮤터블 ( Mutable ) : 입력된 값을 변경 할 수 있는 배열
        // 셋 ( Set ) : 중복된 요소를 허용 안하는 배열
        // 맵 ( Map ) : 키 , 값 으로 이루어진 배열


    fun array () {
        val intArray = IntArray(4)
        val intArrayOf = intArrayOf(1,2,3,4,5)
        val stringArray = arrayOf("하나" , "둘", 3 , 4 , 1.2) //string 을 쓰고자 할때

        intArray[0] = 50 //SET
        intArray[2] // GET

        intArrayOf[1] = 10 //SET
        intArrayOf[1] // GET
    }

    fun mutableList () {
        // C R U D
        val mList = mutableListOf("1" , "2" , "3")
        mList.add("5") // 추가 C
        mList[2] // 읽기 R
        mList[3] = "45" // 수정 U
        mList.removeAt(0) // 삭제 D

        val genMutableList = mutableListOf<String>()
        genMutableList.add("하나")
        genMutableList.add("둘")
        genMutableList.add("셋")

    }

    fun emptyCollection () {
        // <> 이 있을때
        val stringList = mutableListOf<String>()
        // <> 이 없을떄
        val noGenStringList = mutableListOf("하나" , "둘" , "셋" , 3 , 5.3)

        // C R U D

        //C
        stringList.add("하나")
        stringList.add("둘")
        stringList.add("셋")

        println(stringList)

        //R
        println("첫번째 인덱스의 값은 ${stringList[1]} 입니다")

        //U
        stringList[2] = "수정된 둘"

        //D

        stringList.removeAt(1)
        println(stringList)
    }

    fun getSize () {
        val noGenStringList = mutableListOf("하나" , "둘" , "셋" , 3 , 5.3)
        val result = noGenStringList.size
    }

    fun prohibitDuplication () {
        // 중복을 허용하지 않는 리스트
        val setList = mutableSetOf<Int>()
        setList.add(1)
        setList.add(2)
        setList.add(3)
        //중복 => 입력 list 에 add 가 안됨
        setList.add(1)
        println(setList)

        setList.remove(2)
//        removeAt != remove
//        remove : element
//        removeAt : index
        println(setList)
    }

    fun map () {
        val map = mutableMapOf<String , String>()
        // C
        map["key1"] = "하나"
        map["key2"] = "둘"
        map["key3"] = "셋"

        // R
        println(map["key2"])

        // U
        map["key2"] = "수정된 둘"

        //D
        map.remove("key2")
    }

    fun immutableCollection () {
        val zeroImList = listOf<String>()
        val imList = listOf("3" ,"2", "1")
        imList[2]

        //ex
        val day = listOf("월" ,"화", "수" , "목" , "금" , "토" , "일")
    }

}
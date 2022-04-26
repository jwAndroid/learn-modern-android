package com.jw_android.learn_modern_android.intermediate

import com.jw_android.learn_modern_android.utils_study.Console

// 스트림 함수 ref : https://bb-library.tistory.com/145
// 스트림 함수 ref : https://leveloper.tistory.com/134

const val ZERO = 0

data class Chat (var message : String? , var id : Int)

class StreamFunction {

    private val cities = mutableListOf("Seoul", "Tokyo", "New york" , "C" , "asdasdasd" , "A")
    private val newCities = mutableListOf("Seoul", "Tokyo", "Mountain View" , "Mountain Siew", "Seoul","London" , "Tokyo ")
    private val orderBy = mutableListOf(
        Chat("hi" ,123),
        Chat("hi jw" ,23),
        Chat("android good" ,254),
        Chat("android 12312" ,23),
        Chat("android developer jw" ,1)
    )


    init {
        sortOrderBy()
    }

    private fun sortOrderBy() {
       val result = orderBy.sortedByDescending { it.id }.apply {
           this[2].message = "바꿨어!!"
       }
        Console.log(result.toString())
    }

    private fun map () {

        val chats = mutableListOf(
            Chat("hi" ,1),
            Chat("hi jw" ,2),
            Chat("android good" ,3)
        )

        val updateChat = chats.map { chat ->
            chat.message?.uppercase() ?: ""
        }

        Console.log(updateChat.toString())
    }

    private fun mapNotnull() {
        val result = cities.mapNotNull { city ->
            if(city.length > 5) city else null
        }

        Console.log(result.toString())

//        만약에 그냥 map 으로 했을경우 [null, null, New york] 를 반환하지만
//        mapNotNull 은 요소를 아예 제거해준다.

//        배열의 특정조건에서 제거해주거나 변경할수있다.
    }
    private fun groupBy() {
        val result = cities.groupBy { city ->
            if (city.length > 5) "key_A" else "key_b"
        }

        Console.log(result)

        val getValue = result["key_b"]?.get(1)

        Console.log(getValue)
    }
    private fun filter () {
        val result = cities.filter { city -> city.length > 5 && city == "New york"}
        Console.log(result)
    }

    private fun take () {
//        배열 앞에서 하나만 뽑아서 "배열"로 반환
        val take = cities.take(1)
        val elementTake = cities.take(1)[ZERO]
        Console.log(take)
        Console.log(elementTake)
    }

    private fun takeLast() {
        val takeLast = cities.takeLast(1)[ZERO]
        Console.log(takeLast)
    }

    private fun takeWhile() {
//        앞에서부터 "조건이 만족할때까지만"의 요소를 새로운 배열로 반환한다.
//        [Seoul, Tokyo, New york] 를 리턴
//        뒤에 5 보다 크거나 같은 엘리먼트가 있음에도 불구하고 배열 3번째 요소에서 끊켰다.
        val takeWhile = cities.takeWhile { city -> city.length >= 5 }

        Console.log(takeWhile)
    }

    private fun takeLastWhile() {
//        뒤에서부터 조건이 만족할때까지만 반환하는데
//        읽히는 순서가 A 부터 시작한다는것이고
//        반환하는건 순서대로 반환을 한다는것이다. << 이점 유의
        val takeLastWhile = cities.takeLastWhile { city ->
            city.length < 5
        }

        Console.log(takeLastWhile)
    }

    private fun drop() {
//        앞에서부터 n개만 제거후 새로운 배열 반환
        val drop = cities.drop(2)
        Console.log(drop)
    }

    private fun dropLast() {
//        뒤에서부터 n개만 제거후 새로운 배열 반환
        val dropLast = cities.dropLast(2)
        Console.log(dropLast)
    }

    private fun first() {
//        배열 가장 맨앞의 "값" 을 반환
        Console.log(cities.first())

//        앞에서부터 조건을 만족할때까지의 값을 반환 , 조건을 만족한다면 거기서 끊킴
        Console.log(cities.first{ city -> city.length > 5})
    }

    private fun last() {
//        배열 가장 맨뒤의 "값" 을 반환
        Console.log(cities.last())

//        뒤에서부터 조건을 만족할때까지의 값을 반환 , 조건을 만족한다면 거기서 끊킴
        Console.log(cities.last{ city -> city.length > 5})
    }

    private fun distinct() {
//        distinct() 함수는 컬렉션 내의 모든 중복을 제거한 결과를 반환한다.
//        중복 여부는 equals()를 통해 확인한다.
//        distinctBy()를 통해 비교에 사용할 키 값을 직접 설정하는 것도 가능하다.

        val distinct = newCities.map { it.trim() }.distinct()
//        공백 제거후 중복제거후 새로운 배열반환

        Console.log(distinct)
    }

    private fun distinctBy() {
//        배열의 길이를 기준으로 판단.
//        앞에있는것을 반환함. 예를들어서 원소의 길이가
//        5 , 5 , 5 , 6 , 5 , 10 , 6 이렇게 있다면
//        5 , 6 , 10 이렇게 반환한다. 가장 앞에있는것을 배열의 길이를 기준으로 가져옴.
        val distinctBy = newCities.distinctBy { it.length }
        Console.log(distinctBy)
    }

}
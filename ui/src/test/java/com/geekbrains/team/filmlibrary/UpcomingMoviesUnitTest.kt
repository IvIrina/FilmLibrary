package com.geekbrains.team.filmlibrary

import org.junit.Assert.assertEquals
import org.junit.Test


class UpcomingMoviesUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }
//
////    private val repository: UpcomingMoviesRepository = UpcomingMoviesRepositoryImpl()
////    private var useCaseForTest: SingleUseCase<List<UpcomingMovie>, Int> =
////        GetUpcomingMovies(repository)
////
////    @Test
////    fun getUpcomingMovies_Success() {
////        var mError = false
////        useCaseForTest.execute(1)
////            .subscribe({ response ->
////                print(response.toString())
////            }, { t ->
////                mError = true
////                print(t.localizedMessage)
////            })
////        assertEquals("Get error with request", mError, false)
////    }
////
////    @Test
////    fun getUpcomingMovies_Error() {
////        var mError = false
////        useCaseForTest.execute(-123)
////            .subscribe({ response ->
////                print(response.toString())
////            }, { t ->
////                mError = true
////                print(t.localizedMessage)
////            })
////        assertEquals("Get error with request", mError, true)
////    }
}
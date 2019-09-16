package com.dai1678.sample_circle_ci

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class AnswerValidatorTest {

    @Test
    fun answerValidator_CorrectAnswer_ReturnsTrue() {
        assertTrue(AnswerValidator.isValidAnswer("robop"))
    }

    @Test
    fun answerValidator_NullAnswer_ReturnsFalse() {
        assertFalse(AnswerValidator.isValidAnswer(null))
    }
}

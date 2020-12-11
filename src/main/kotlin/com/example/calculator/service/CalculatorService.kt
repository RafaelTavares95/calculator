package com.example.calculator.service

import com.example.calculator.enum.Operation
import org.springframework.stereotype.Service

@Service
class CalculatorService {

    fun process(a:Int, b:Int, op:Operation) = when(op){
        Operation.SUM -> calculate(a, b, ::sum)
        Operation.SUB -> calculate(a, b, ::sub)
        Operation.DIV -> calculate(a, b, ::div)
        Operation.MUT -> calculate(a, b, ::mut)
        else -> throw IllegalArgumentException("Unknown Operation")
    }

    fun calculate(a:Int, b:Int, operation :(Int, Int) -> Int) : Int = operation(a, b)
    fun sum(a:Int, b:Int) = a + b
    fun sub(a:Int, b:Int) = a - b
    fun div(a:Int, b:Int) = a / b
    fun mut(a:Int, b:Int) = a * b
}
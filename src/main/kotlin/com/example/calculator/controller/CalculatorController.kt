package com.example.calculator.controller

import com.example.calculator.enum.Operation
import com.example.calculator.service.CalculatorService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/calculator")
class CalculatorController @Autowired constructor(private val calculatorService: CalculatorService){

    @GetMapping("/sum")
    fun sum(@RequestParam("a") a:Int, @RequestParam("b") b:Int): Int {
        return calculatorService.process(a, b, Operation.SUM)
    }

    @GetMapping("/sub")
    fun sub(@RequestParam("a") a:Int, @RequestParam("b") b:Int): Int {
        return calculatorService.process(a, b, Operation.SUB)
    }

    @GetMapping("/div")
    fun div(@RequestParam("a") a:Int, @RequestParam("b") b:Int): Int {
        return calculatorService.process(a, b, Operation.DIV)
    }

    @GetMapping("/mut")
    fun mut(@RequestParam("a") a:Int, @RequestParam("b") b:Int): Int {
        return calculatorService.process(a, b, Operation.MUT)
    }

}
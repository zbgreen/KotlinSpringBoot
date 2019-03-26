package com.kotlinspringboot.controllers

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.ui.Model
import BattingAverage
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class KotlinController {
	
	@GetMapping("/kotlin")
	fun kotlin(): String {
		return "kotlin"
	}
	
	@GetMapping("/battingAverage/{hits}/{atBats}")
	@ResponseBody
	fun battingAverage(@PathVariable hits: Double,
					   @PathVariable atBats: Double): BattingAverage {
		return BattingAverage(hits, atBats, hits.div(atBats))
	}
}
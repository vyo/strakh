package io.github.vyo.strakh.model.goal

import io.github.vyo.strakh.goap.client.Goal
import io.github.vyo.strakh.model.agent.Worker

/**
 * Created by Manuel Weidmann on 22.11.2015.
 */

class MiningGas(worker: Worker) : Goal(worker) {
    init {
        value = 15
    }

    val worker = worker

    override fun reached(): Boolean {
        return worker.isMiningGas
    }


    override fun toString(): String {
        return "MiningGas"
    }
}
package io.github.vyo.strakh.goap.component

/**
 * Created by Manuel Weidmann on 21.11.2015.
 */

interface Goal : Comparable<Goal> {

    var agent: Agent
    var value: Int

    fun reached(): Boolean

    override fun compareTo(other: Goal): Int {
        return value.compareTo(other.value)
    }

    interface Atomic : Goal

    interface Composite : Goal

    interface Absolute : Goal

    interface Relative : Goal
}
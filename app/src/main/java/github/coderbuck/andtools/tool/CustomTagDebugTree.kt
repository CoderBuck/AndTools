package github.coderbuck.andtools.tool

import timber.log.Timber

class CustomTagDebugTree(val preTag: String = "kd-") : Timber.DebugTree() {

    override fun log(priority: Int, tag: String?, message: String, t: Throwable?) {
        super.log(priority, preTag + tag, message, t)
    }
}
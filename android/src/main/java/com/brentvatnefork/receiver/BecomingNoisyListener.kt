package com.brentvatnefork.receiver

interface BecomingNoisyListener {
    companion object {
        val NO_OP = object : BecomingNoisyListener {
            override fun onAudioBecomingNoisy() {
                // NO_OP
            }
        }
    }
    fun onAudioBecomingNoisy()
}

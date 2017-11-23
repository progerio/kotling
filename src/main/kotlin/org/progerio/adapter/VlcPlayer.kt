package main.kotlin.org.progerio.adapter

class VlcPlayer : AdvancedMediaPlayer {
    /**
     * playVlc
     *
     * @return Any
     */
    override fun playVlc(filename: String) {
        println("Playing vlc file. Name: $filename")
    }

    /**
     * playMp4
     *
     * @return Any
     */
    override fun playMp4(filename: String) {
        TODO("not implemented")
    }
}
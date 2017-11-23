package main.kotlin.org.progerio.adapter

class Mp4Player : AdvancedMediaPlayer {
    /**
     * playVlc
     *
     * @return Any
     */
    override fun playVlc(filename: String) {
        TODO("not implemented")
    }

    /**
     * playMp4
     *
     * @return Any
     */
    override fun playMp4(filename: String) {
        println("Playing mp4 file. Name: $filename")
    }
}
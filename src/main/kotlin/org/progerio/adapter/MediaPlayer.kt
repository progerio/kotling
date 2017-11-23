package main.kotlin.org.progerio.adapter

/**
 * Interface MediaPlayer.
 *
 * @author Paulo Rogerio.
 */
interface MediaPlayer {

    /**
     * Play
     */
    fun play(audioType: String, filename: String)
}
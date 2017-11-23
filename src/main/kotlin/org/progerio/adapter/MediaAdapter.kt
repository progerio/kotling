package main.kotlin.org.progerio.adapter

class MediaAdapter(audioType: String) : MediaPlayer {

    var advancedMusicPlayer: AdvancedMediaPlayer? = null

    fun constructor(audioType: String) {
        if (audioType.equals("vlc", ignoreCase = true)) {
            advancedMusicPlayer = VlcPlayer()
        } else if (audioType.equals("mp4", ignoreCase = true)) {
            advancedMusicPlayer = Mp4Player()
        }
    }

    /**
     * Play
     */
    override fun play(audioType: String, filename: String) {
        if (audioType.equals("vlc", ignoreCase = true)) {
            advancedMusicPlayer?.playVlc(filename)
        } else if (audioType.equals("mp4", ignoreCase = true)) {
            advancedMusicPlayer?.playMp4(filename)
        }
    }
}
package main.kotlin.org.progerio.adapter

class AudioPlayer : MediaPlayer{

    private var mediaAdapter: MediaAdapter?=null

   override fun play(audioType: String, filename: String) {

        //inbuilt support to play mp3 music files
        if (audioType.equals("mp3", ignoreCase = true)) {
            println("Playing mp3 file. Name: " + filename)
        } else if (audioType.equals("vlc", ignoreCase = true) || audioType.equals("mp4", ignoreCase = true)) {
            mediaAdapter = MediaAdapter(audioType)
            mediaAdapter?.play(audioType, filename)
        } else {
            println("Invalid media. $audioType format not supported")
        }//mediaAdapter is providing support to play other file formats
    }
}
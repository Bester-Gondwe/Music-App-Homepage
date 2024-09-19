package com.example.musicstreamingapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.musicapptry.getSampleSongsList
import com.example.musicstreamingapp.ui.theme.MusicStreamingAppTheme


// Main Activity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MusicStreamingAppTheme{
                // Call to MusicApp with sample songs
                MusicApp(songs = getSampleSongsList(), currentlyPlaying = getSampleSongsList().first())
            }
        }
    }
}

// Preview function for MusicApp
@Preview(showBackground = true)
@Composable
fun PreviewMusicApp() {
    MusicStreamingAppTheme {
        // Call to MusicApp with sample songs for preview
        MusicApp(songs = getSampleSongsList(), currentlyPlaying = getSampleSongsList().first())
    }
}


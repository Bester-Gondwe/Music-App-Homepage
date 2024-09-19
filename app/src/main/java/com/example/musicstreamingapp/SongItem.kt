package com.example.musicstreamingapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.musicstreamingapp.R


// Composable function to represent each song item in the list
@Composable
fun SongItem(song: Song) {
    Row(Modifier.fillMaxWidth().padding(8.dp), verticalAlignment = Alignment.CenterVertically) {
        Image(
            painter = painterResource(id = song.artworkResId),
            contentDescription = "Song Image",
            modifier = Modifier.size(64.dp)
        )
        Spacer(modifier = Modifier.width(16.dp))
        Column(modifier = Modifier.weight(4f)) {
            Text(song.title)
            Text(song.artist)
        }
        Spacer(modifier = Modifier.width(16.dp))
        IconButton(onClick = {}) {
            Icon(
                painter = painterResource(id = R.drawable.baseline_play_arrow_24),
                contentDescription = "Play",
                modifier = Modifier.size(32.dp)
            )
        }

        IconButton(onClick = {}) {
            Icon(
                painter = painterResource(id = R.drawable.baseline_more_vert_24),
                contentDescription = "More Options",
                modifier = Modifier.size(32.dp)
            )
        }
    }
}


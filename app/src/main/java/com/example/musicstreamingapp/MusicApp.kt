package com.example.musicstreamingapp

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.musicstreamingapp.ui.theme.Purple40


@Composable
fun CurrentlyPlaying(songTitle: String, artistName: String) {
    // Displays the currently playing song title and artist
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        // Display current song information
        Text("Currently Playing: $songTitle by $artistName")
    }
}

// Music app list
@Composable
fun MusicApp(songs: List<Song>, currentlyPlaying: Song) {
    Box(Modifier.fillMaxSize()) {
        Column(
            Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Title Text

            Text(
                "SoundScape",
                fontSize = 30.sp,
                color = Purple40,
                style = MaterialTheme.typography.titleLarge,
                modifier = Modifier.padding(bottom = 8.dp)
            )

            // Top Icons Row
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                IconButton(onClick = {}) {
                    Icon(
                        painter = painterResource(id = R.drawable.baseline_menu_24),
                        contentDescription = "Menu"
                    )
                }
                IconButton(onClick = {}) {
                    Icon(
                        painter = painterResource(id = R.drawable.baseline_notifications_24),
                        contentDescription = "Notifications"
                    )
                }
                IconButton(onClick = {}) {
                    Icon(
                        painter = painterResource(id = R.drawable.baseline_settings_24),
                        contentDescription = "Settings"
                    )
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            // Button Row
            Row(

                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                Button(onClick = { /* Handle Artists click */ }, modifier = Modifier.padding(8.dp)) {
                    Text("Artists")
                }
                Button(onClick = { /* Handle Albums click */ }, modifier = Modifier.padding(8.dp)) {
                    Text("Albums")
                }
                Button(onClick = { /* Handle Playlists click */ }, modifier = Modifier.padding(8.dp)) {
                    Text("Playlists")
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            // LazyColumn for displaying the list of songs
            LazyColumn(
                Modifier
                    .weight(1f)
                    .padding(bottom = 17.dp)
            ) {
                items(songs) { song ->
                    SongItem(song)
                }
            }

            @Composable
            fun BottomNavigationBar() {
                Row(
                    Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    horizontalArrangement = Arrangement.SpaceAround
                ) {
                    IconButton(onClick = {}) {
                        Icon(
                            painter = painterResource(id = R.drawable.baseline_home_24),
                            contentDescription = "Home"
                        )
                    }
                    IconButton(onClick = {}) {
                        Icon(
                            painter = painterResource(id = R.drawable.baseline_search_24),
                            contentDescription = "Search"
                        )
                    }
                    IconButton(onClick = {}) {
                        Icon(
                            painter = painterResource(id = R.drawable.baseline_library_music_24),
                            contentDescription = "Libraries"
                        )
                    }
                    IconButton(onClick = {}) {
                        Icon(
                            painter = painterResource(id = R.drawable.baseline_account_circle_24),
                            contentDescription = "my account"
                        )
                    }
                }
            }

            // Currently Playing Song Details
            // Passes the currently playing song's title and artist name to the child component
            CurrentlyPlaying(songTitle = currentlyPlaying.title, artistName = currentlyPlaying.artist)

            Spacer(modifier = Modifier.height(16.dp))

            // Bottom Navigation Bar
            BottomNavigationBar()
        }
    }
}

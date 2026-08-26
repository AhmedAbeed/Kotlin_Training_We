package com.example.yehya

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun TestLabScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize()
    ) {
        TestLabContent()
    }
}

@Composable
fun TestLabContent() {
    UsersScreen()
}

data class LabUser(
    val name: String,
    val isOnline: Boolean
)

@Composable
fun UserCard(user: LabUser) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(
                color = Color(0xFFEEEEEE),
                shape = RoundedCornerShape(12.dp)
            )
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = user.name
        )

        Spacer(
            modifier = Modifier.weight(1f)
        )

        Text(
            text = if (user.isOnline) "Online" else "Offline",
            color = if (user.isOnline) Color.Black else Color.Red
        )
    }
}

@Composable
fun UsersScreen() {
    val users = listOf(
        LabUser("Ahmed", true),
        LabUser("Ali", false),
        LabUser("Mohamed", true),
        LabUser("Omar", false),
        LabUser("Yehya", true),
        LabUser("Mohamed", true),
        LabUser("Omar", false),
        LabUser("Mohamed", true),
        LabUser("Omar", false),
        LabUser("Mohamed", true),
        LabUser("Omar", false),
        LabUser("Mohamed", true),
        LabUser("Omar", false),
        LabUser("Mohamed", true),
        LabUser("Omar", false),
        LabUser("Mohamed", true),
        LabUser("Omar", false),
        LabUser("Mohamed", true),
        LabUser("Omar", false),
    )

    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(8.dp),
        modifier = Modifier.padding(16.dp)
    ) {
        items(users) { user ->
            UserCard(user)
        }
    }
}

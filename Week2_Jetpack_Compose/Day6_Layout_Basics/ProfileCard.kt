package com.example.myapplicationa

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            ProfileCard()
        }
    }
}

@Composable
fun ActionButton(
    icon: ImageVector,
    description: String?
) {
    Box(
        modifier = Modifier
            .size(width = 100.dp, height = 50.dp)
            .clip(RoundedCornerShape(50))
            .background(Color.Gray),
        contentAlignment = Alignment.Center
    ) {
        Icon(
            imageVector = icon,
            contentDescription = description,
            tint = Color.White,
            modifier = Modifier.size(40.dp)
        )
    }
}

@Composable
fun InfoRow(
    value: String,
    label: String
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp)
            .background(Color(0xFF17212B)),
        contentAlignment = Alignment.CenterStart
    ) {
        Column(
            modifier = Modifier.padding(start = 16.dp)
        ) {
            Text(
                text = value,
                color = Color.White
            )

            Text(
                text = label,
                color = Color(0xFF8A8F98)
            )
        }
    }
}

@Composable
fun ProfileCard() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(Color(0xFF232E3C)),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(
            modifier = Modifier.height(100.dp)
        )

        Box(
            modifier = Modifier
                .size(80.dp)
                .clip(CircleShape)
                .background(Color.Gray),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                imageVector = Icons.Default.Person,
                contentDescription = null,
                tint = Color.White,
                modifier = Modifier.size(60.dp)
            )
        }

        Spacer(
            modifier = Modifier.height(20.dp)
        )

        Text(
            text = "Ahmed Mohamed",
            color = Color.White
        )

        Text(
            text = "online",
            color = Color.White
        )

        Spacer(
            modifier = Modifier.height(12.dp)
        )

        Row {
            ActionButton(
                icon = Icons.Default.Settings,
                description = "Settings"
            )

            Spacer(
                modifier = Modifier.width(24.dp)
            )

            ActionButton(
                icon = Icons.Default.Edit,
                description = null
            )

            Spacer(
                modifier = Modifier.width(24.dp)
            )

            ActionButton(
                icon = Icons.Default.LocationOn,
                description = null
            )
        }

        Spacer(
            modifier = Modifier.height(17.dp)
        )

        Column {
            InfoRow(
                value = "+201011447516",
                label = "Mobile"
            )

            Spacer(
                modifier = Modifier.height(2.dp)
            )

            InfoRow(
                value = "@ahmed404",
                label = "Username"
            )
        }
    }
}

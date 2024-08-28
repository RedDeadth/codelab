import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.codelab.R

@Composable
fun TutorialScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Jetpack Compose Tutorial") },
                navigationIcon = {
                    IconButton(onClick = { /* TODO: Open drawer */ }) {
                        Icon(Icons.Filled.Menu, contentDescription = "Menu")
                    }
                },
                actions = {
                    IconButton(onClick = { /* TODO: Open settings */ }) {
                        Icon(Icons.Filled.Settings, contentDescription = "Settings")
                    }
                }
            )
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .padding(padding)
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.jetpack_compose_icon),
                contentDescription = "Jetpack Compose Icon",
                modifier = Modifier
                    .fillMaxWidth()
                    .aspectRatio(1.5f)
                    .align(Alignment.CenterHorizontally),
                contentScale = ContentScale.Crop
            )

            Text(
                text = "Jetpack Compose tutorial",
                style = MaterialTheme.typography.h6.copy(fontSize = 24.sp),
                modifier = Modifier.padding(16.dp)
            )


            Text(
                text = "Jetpack Compose is a modern toolkit for building native Android UI. Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs.",
                style = MaterialTheme.typography.body1,
                modifier = Modifier.padding(horizontal = 16.dp),  // Agregar padding solo en inicio y fin
                textAlign = TextAlign.Justify  // Alinear el texto con Justify
            )
            Text(
                text = "In this tutorial, you build a simple UI component with declarative functions. You call Compose functions to say what elements you want and the Compose compiler does the rest. Compose is built around Composable functions. These functions let you define your app's UI programmatically because they let you describe how it should look and provide data dependencies, rather than focus on the process of the UI's construction, such as initializing an element and then attaching it to a parent. To create a Composable function, you add the @Composable annotation to the function name.",
                style = MaterialTheme.typography.body1,
                modifier = Modifier.padding(16.dp),  // Agregar padding de 16dp en todas las direcciones
                textAlign = TextAlign.Justify  // Alinear el texto con Justify
            )

        }
    }
}

@Preview(showBackground = true)
@Composable
fun TutorialScreenPreview() {
    MaterialTheme {
        TutorialScreen()
    }
}
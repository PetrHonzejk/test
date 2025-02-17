package cz.pslib.test

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun PostListScreen(viewModel: PostViewModel) {

    //TODO: Implementace seznamu příspěvků
    /* Nahraďte kódem pro zobrazení seznamu příspěvků získaných z view modelu */

    Box(modifier = Modifier.fillMaxSize()) {
        PostCard(title = "Zde bude titulek", body = "A tady potom bude text příspěvku")
    }

}

// Komponenta pro zobrazení jednotlivého příspěvku
@Composable
fun PostCard(title: String, body: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(
                text = title,
                )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = body,
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PostListScreenPreview() {
    PostListScreen(PostViewModel())
}




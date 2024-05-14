package presentation.screen.home
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen
import domain.RequestState
import domain.TodoTask

class HomeScreen : Screen {
    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    override fun Content() {
        Scaffold(
            topBar = {
                CenterAlignedTopAppBar(title = { Text(text = "Home") })
            },
            floatingActionButton = {
                FloatingActionButton(
                    onClick = {},
                    shape = RoundedCornerShape(size = 12.dp)
                ){
                    Icon(
                        imageVector = Icons.Default.Edit,
                        contentDescription = "Edit Icon"
                    )
                }
            }
        ){ padding ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 24.dp)
                    .padding(top= padding.calculateTopPadding(),
                        bottom = padding.calculateBottomPadding())
            ){

            }
        }
    }
}


@Composable
fun displayTasks(
    modifier: Modifier = Modifier,
    tasks: RequestState<List<TodoTask>>,
    showActive: Boolean = true,
    onSelect: ((TodoTask) -> Unit)? = null,
    onFavourite: ((TodoTask, Boolean) -> Unit)? = null,
    onComplete: ((TodoTask, Boolean) -> Unit),
    onDelete: ((TodoTask, Boolean) -> Unit)? = null,
){
    var showDialog by remember { mutableStateOf(false) }
    var taskToDelete:TodoTask? by remember { mutableStateOf(null) }

    if(showDialog){
        
    }
}
package com.breens.movetonexttextfieldautomatically

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp
import com.breens.movetonexttextfieldautomatically.ui.theme.MoveToNextTextfieldAutomaticallyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var firstName by remember {
                mutableStateOf("")
            }
            var lastName by remember {
                mutableStateOf("")
            }
            var email by remember {
                mutableStateOf("")
            }
            var phoneNumber by remember {
                mutableStateOf("")
            }

            MoveToNextTextfieldAutomaticallyTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.spacedBy(12.dp)
                    ) {
                        OutlinedTextField(
                            modifier = Modifier.fillMaxWidth(),
                            value = firstName,
                            onValueChange = {
                                firstName = it
                            },
                            label = {
                                Text(
                                    "First Name",
                                    style = MaterialTheme.typography.labelMedium
                                )
                            },
                            keyboardOptions = KeyboardOptions(
                                imeAction = ImeAction.Next
                            )
                        )

                        OutlinedTextField(
                            modifier = Modifier.fillMaxWidth(),
                            value = lastName,
                            onValueChange = {
                                lastName = it
                            },
                            label = {
                                Text(
                                    "Last Name",
                                    style = MaterialTheme.typography.labelMedium
                                )
                            },
                            keyboardOptions = KeyboardOptions(
                                imeAction = ImeAction.Next
                            )
                        )

                        OutlinedTextField(
                            modifier = Modifier.fillMaxWidth(),
                            value = email,
                            onValueChange = {
                                email = it
                            },
                            label = {
                                Text(
                                    "Email Address",
                                    style = MaterialTheme.typography.labelMedium
                                )
                            },
                            keyboardOptions = KeyboardOptions(
                                imeAction = ImeAction.Next
                            )
                        )

                        OutlinedTextField(
                            modifier = Modifier.fillMaxWidth(),
                            value = phoneNumber,
                            onValueChange = {
                                phoneNumber = it
                            },
                            label = {
                                Text(
                                    "Phone Number",
                                    style = MaterialTheme.typography.labelMedium
                                )
                            },
                            keyboardOptions = KeyboardOptions(
                                imeAction = ImeAction.Done
                            )
                        )

                        Button(
                            onClick = { /*TODO*/ },
                            modifier = Modifier.fillMaxWidth(),
                        ) {
                            Text("Submit", style = MaterialTheme.typography.bodyMedium)
                        }
                    }
                }
            }
        }
    }
}
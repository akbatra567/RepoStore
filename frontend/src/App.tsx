import { Box, Button, FormControl, TextField } from '@mui/material'
import './App.css'
import axios from 'axios'

function App() {
const handleRegister = () => {
  axios.post('http://localhost:8080/users/create', {
    "firstName": "abc",
    "lastName": "dasa",
    "password": "sadsa",
    "userName": "d1asda",
    "email": "abc@example.com"
  })
}
  return (
    <>
      <Box
        component="form"
        sx={{ '& .MuiTextField-root': { m: 1, width: '25ch' } }}
        noValidate
        autoComplete="off"
      >
        <FormControl>
          <TextField
            required
            id="firstName"
            label="First Name"
            placeholder="First Name"
            variant="standard"
          />
          <TextField
            required
            id="lastName"
            label="Last Name"
            placeholder="Last Name"
            variant="standard"
          />
          <TextField
            required
            type='password'
            id="password"
            label="Password"
            placeholder="Password"
            variant="standard"
          />
          <TextField
            required
            id="userName"
            label="Username"
            placeholder="Username"
            variant="standard"
          />
          <TextField
            required
            type='email'
            id="email"
            label="Email"
            placeholder="Email"
            variant="standard"
          />

          <Button variant="text" onClick={handleRegister}>Register</Button>
        </FormControl>
      </Box>
    </>
  )
}

export default App

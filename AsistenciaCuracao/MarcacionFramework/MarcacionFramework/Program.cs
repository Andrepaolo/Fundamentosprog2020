using MarcacionFramework.Models;
using System;
using System.Collections.Generic;
using System.Linq;


namespace MarcacionFramework
{
    class Program
    {
        static List<Empleado> Empleados = new List<Empleado>
        {
            new Empleado
            {
                Id = 154,
                Apellido = "Araujo Perez",
                Nombre = "Yessica Alexandra",
                Dni = 78213501,
                Celular = 951671980,
            },
            new Empleado
            {
                Id = 183,
                Apellido = "Barrios Churra",
                Nombre = "Yordy Josue",
                Dni = 74326542,
                Celular = 951900682,
            },
            new Empleado
            {
                Id = 43,
                Apellido = "Diaz Tito",
                Nombre = "Angie Mayumi",
                Dni = 65203795,
                Celular = 987654321,

            },
            new Empleado
            {
                Id = 62,
                Apellido = "Mejia Acuña",
                Nombre = "Sofia Paola",
                Dni = 63770018,
                Celular = 974358462,
            },
            new Empleado
            {
                Id = 122,
                Apellido = "Mendoza Flores",
                Nombre = "Juan Carlos",
                Dni = 74952481,
                Celular = 900,
            },
            new Empleado
            {
                Id = 110,
                Apellido = "Narvaez Coyla",
                Nombre = "Anthony Kevin",
                Dni = 65821954,
                Celular = 958422885,
             },
            new Empleado
            {
                Id = 93,
                Apellido = "Ramos Castillos",
                Nombre = "Alain Jack",
                Dni = 73954826,
                Celular = 951426850,
              },
            new Empleado
            {
                Id = 75,
                Apellido = "Rios Cueva",
                Nombre = "Sindy",
                Dni = 78516237,
                Celular = 9511426850,
             },
            new Empleado
            {
                Id = 179,
                Apellido = "Tejada Paredes",
                Nombre = "Jasmin Yuliana",
                Dni = 82629513,
                Celular = 975361826,
            }
        };

        static void Main(string[] args)
        {
            bool SalidaEntradaMedioDia = false;
            Console.WriteLine("Marcación de Horarios - La Curacao (RR.HH - Tarapoto)");
        Init:
            Console.WriteLine("Ingrese su ID.");
            bool isNumeric = int.TryParse(Console.ReadLine(), out int value);
            if (isNumeric)
            {
                Empleado empleadoSeleccionado = Empleados.Where(x => x.Id == value).SingleOrDefault();
                if (empleadoSeleccionado != null)
                {
                    Console.WriteLine("-------------------------------------------------------------------");
                    Console.WriteLine($"Bienvenido {empleadoSeleccionado.Apellido}, {empleadoSeleccionado.Nombre}");
                    DateTime fechaHoraMarcacion = DateTime.Now;
                ChequearHora:
                    if (fechaHoraMarcacion.Hour >= 0 && fechaHoraMarcacion.Hour < 8)
                    {
                        Console.WriteLine("---Aviso: Su marcación esta registrada como \"Pre-entrada\"--- ");
                        Console.WriteLine($"Fecha:{fechaHoraMarcacion.ToShortDateString()}");
                        Console.WriteLine($"Hora: {fechaHoraMarcacion.ToShortTimeString()}");
                    }
                    if (fechaHoraMarcacion.Hour >= 8 && fechaHoraMarcacion.Hour < 12)
                    {
                        Console.WriteLine("---Aviso: Su marcación esta registrada como \"Post-entrada\"--- ");
                        Console.WriteLine($"Fecha:{fechaHoraMarcacion.ToShortDateString()}");
                        Console.WriteLine($"Hora: {fechaHoraMarcacion.ToShortTimeString()}");
                    }
                    if (fechaHoraMarcacion.Hour >= 12 && fechaHoraMarcacion.Hour < 14)
                    {
                        if (SalidaEntradaMedioDia)
                        {
                            Console.WriteLine("---Aviso: Su marcación esta registrada como \"Entrada - Medio día\"--- ");
                            Console.WriteLine($"Fecha:{fechaHoraMarcacion.ToShortDateString()}");
                            Console.WriteLine($"Hora: {fechaHoraMarcacion.ToShortTimeString()}");
                        }
                        else
                        {
                            Console.WriteLine("---Aviso: Su marcación esta registrada como \"Salida - Medio día\"--- ");
                            Console.WriteLine($"Fecha:{fechaHoraMarcacion.ToShortDateString()}");
                            Console.WriteLine($"Hora: {fechaHoraMarcacion.ToShortTimeString()}");
                            SalidaEntradaMedioDia = true;
                        }
                    }
                    else if (fechaHoraMarcacion.Hour >= 14 && fechaHoraMarcacion.Hour <= 18)
                    {
                        Console.WriteLine("---Aviso: Su marcación esta registrada como \"Pre-salida\"--- ");
                        Console.WriteLine($"Fecha: {fechaHoraMarcacion.ToShortDateString()}");
                        Console.WriteLine($"Hora: {fechaHoraMarcacion.ToShortTimeString()}");
                    }
                    else if (fechaHoraMarcacion.Hour >= 18 && fechaHoraMarcacion.Hour <= 23)
                    {
                        Console.WriteLine("---Aviso: Su marcación esta registrada como \"Post-salida\"--- ");
                        Console.WriteLine($"Fecha: {fechaHoraMarcacion.ToShortDateString()}");
                        Console.WriteLine($"Hora: {fechaHoraMarcacion.ToShortTimeString()}");
                    }
                    Console.WriteLine("-------------------------------------------------------------------");
                    Console.WriteLine("¿Desea ingresar una hora de ingreso manualmente?");
                    Console.Write("Marque \"Si\" o \"No\": ");
                    string respuesta = Console.ReadLine();
                    if (respuesta.ToLower() == "si")
                    {
                    IngreseHora:
                        Console.WriteLine("Ingrese la hora:");
                        bool isHourNumeric = int.TryParse(Console.ReadLine(), out int numericHour);
                        if (isHourNumeric)
                        {
                            fechaHoraMarcacion = DateTime.Now.Date.Add(new TimeSpan(numericHour, 0, 0));
                            goto ChequearHora;
                        }
                        else
                        {
                            Console.WriteLine("***Error: Por favor ingrese un número entero.***");
                            goto IngreseHora;
                        }
                    }
                    else
                    {
                        Console.WriteLine("-------------------------------------------------------------------");
                        goto Init;
                    }
                }
                else
                {
                    Console.WriteLine($"***Error: Por favor ingrese un \"ID\" válido.***");
                    goto Init;
                }
            }
            else
            {
                Console.WriteLine("***Error: Por favor ingrese un número entero.***");
                goto Init;
            }
        }
    }
}
